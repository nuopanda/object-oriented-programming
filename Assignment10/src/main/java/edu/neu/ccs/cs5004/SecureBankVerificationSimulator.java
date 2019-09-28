package edu.neu.ccs.cs5004;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * The class Secure bank verification simulator.
 */
public class SecureBankVerificationSimulator {

  private static final Integer CLIENT_NUM_BOUND = 50000;
  private static final Integer VERIFICATION_NUM_BOUND = 10000;
  private static final double PERCENT_LOWER_BOUND = 0;
  private static final double PERCENT_UPPER_BOUND = 100;
  private static final Integer ARGUMENT_NUMBER = 4;
  private static final Integer ONE = 1;
  private Random random = new Random();
  private Bank bank;


  /**
   * Instantiates a new Secure bank verification simulator.
   */
  public SecureBankVerificationSimulator() {
    bank = new Bank();

  }

  /**
   * Parse command line.
   *
   * @param args the args
   * @return the parse result
   */
  public ParseResult parseCommandLine(String[] args) {
    if (args.length != ARGUMENT_NUMBER) {
      throw new InvalidArgumentsException("invalid input number");
    }
    if (Integer.parseInt(args[0]) > CLIENT_NUM_BOUND) {
      throw new InvalidArgumentsException("the client number exceeds the maximum value");
    }
    Integer clientNum = Integer.parseInt(args[0]);
    if (Integer.parseInt(args[1]) > VERIFICATION_NUM_BOUND) {
      throw new InvalidArgumentsException(
          "the unique verification number exceeds the maximum value");
    }
    Integer verificationNum = Integer.parseInt(args[1]);

    if (Double.valueOf(args[2]) < PERCENT_LOWER_BOUND
        || Double.valueOf(args[2]) > PERCENT_UPPER_BOUND) {
      throw new InvalidArgumentsException("invalid percentage");
    }
    Double invalidPercent = Double.valueOf(args[2]);
    String output = args[3];
    return new ParseResult(clientNum, verificationNum, invalidPercent, output);
  }

  /**
   * Generate client.
   *
   * @param parseResult the parse result
   * @return the client list
   */
  public ClientInfoList generateClient(ParseResult parseResult) {
    List<Integer> clientList = new ArrayList<>();
    Map<Integer, Client> clientMap = new HashMap<>();
    for (int i = 0; i < parseResult.getClientNum(); i++) {
      Integer number = random.nextInt(Integer.MAX_VALUE) + ONE;
      while (clientList.contains(number)) {
        number = random.nextInt(Integer.MAX_VALUE) + ONE;
      }
      Client client = new Client(number, new RsaPair());
      bank.addClient(number, client.getPair().getPublicKey());
      clientList.add(number);
      clientMap.put(number, client);
    }
    return new ClientInfoList(clientList, clientMap);
  }

  /**
   * Generate client signature map.
   *
   * @param clientInfoList the client info list
   * @param parseResult the parse result
   * @return the map
   */
  public Map<Integer, List<MessageSignPair>> generateClientSignatureMap(
      ClientInfoList clientInfoList, ParseResult parseResult) {
    Map<Integer, List<MessageSignPair>> clientSignatureMap = new HashMap<>();
    if (clientInfoList.getClientList().size() <= 0 || clientInfoList.getClientMap().size() <= 0) {
      throw new IllegalArgumentException("should generateClient first");
    }
    for (int i = 0; i < parseResult.getVerificationNum(); i++) {
      Integer number = clientInfoList.getClientList()
          .get(random.nextInt(clientInfoList.getClientList().size()));
      Client client = clientInfoList.getClientMap().get(number);
      MessageSignPair messageSignPair = new MessageSignPair(client,
          parseResult.getInvalidPercent());
      if (!clientSignatureMap.containsKey(number)) {
        clientSignatureMap.put(number, new ArrayList<>());
      }
      clientSignatureMap.get(number).add(messageSignPair);
    }
    return clientSignatureMap;
  }

  /**
   * Write output.
   *
   * @param parseResult the parse result
   * @param clientSignatureMap the client signature map
   */
  public void writeOutput(ParseResult parseResult,
      Map<Integer, List<MessageSignPair>> clientSignatureMap) {
    OutputStreamWriter writer = null;
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(parseResult.getOutput() + ".csv");
      writer = new OutputStreamWriter(fileOutputStream, "UTF-8");
      List<String> list = new ArrayList<>();
      list.add("Transaction number – Date");
      list.add("Time");
      list.add("Client ID");
      list.add("Message");
      list.add("Digital signature");
      list.add("Verified");
      list.add("Transactions status");
      String line = list.stream().collect(Collectors.joining(","));
      writer.write(line);
      writer.write(System.getProperty("line.separator"));
      int current = 1;
      for (Map.Entry<Integer, List<MessageSignPair>> entry : clientSignatureMap.entrySet()) {
        Integer number = entry.getKey();
        List<MessageSignPair> pairs = entry.getValue();
        for (int i = 0; i < pairs.size(); i++) {
          List<String> newList = new ArrayList<>();
          LocalDate today = LocalDate.now();
          Calendar cal = Calendar.getInstance();
          SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
          newList.add(current + "/-" + today);
          current++;
          newList.add(sdf.format(cal.getTime()));
          newList.add(String.valueOf(number));
          newList.add(String.valueOf(pairs.get(i).getMessage()));
          newList.add(pairs.get(i).getSignature() + "");
          boolean verification = bank.verifySignature(pairs.get(i), number);
          newList.add(String.valueOf(verification));
          if (verification) {
            boolean transaction = bank.doTransaction(pairs.get(i), number);
            newList.add(String.valueOf(transaction));
          } else {
            newList.add("false");
          }
          String newLine = newList.stream().collect(Collectors.joining(","));
          writer.write(newLine);
          writer.write(System.getProperty("line.separator"));
        }
      }
    } catch (IOException ioe) {
      System.out.println("Error handling the file: " + ioe.getMessage());
      ioe.printStackTrace();
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e) {
          System.out.println("file cannot be closed");
          e.printStackTrace();
        }
      }
    }
  }

  @Override
  public String toString() {
    return "This is a Simulator";
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }
    if (object == null || this.getClass() != object.getClass()) {
      return false;
    }
    return this.hashCode() == object.hashCode();
  }
}

