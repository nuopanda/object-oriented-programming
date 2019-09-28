package edu.neu.ccs.cs5004;

import java.util.List;
import java.util.Map;

/**
 * The class Main for simulator.
 */
public class MainForSimulator {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SecureBankVerificationSimulator simulator = new SecureBankVerificationSimulator();
    ParseResult parseResult = simulator.parseCommandLine(args);
    ClientInfoList clientInfoList = simulator.generateClient(parseResult);
    Map<Integer, List<MessageSignPair>> clientSignatureMap = simulator
        .generateClientSignatureMap(clientInfoList, parseResult);
    simulator.writeOutput(parseResult, clientSignatureMap);

  }

  @Override
  public String toString() {
    return "This is the main entrance";
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
