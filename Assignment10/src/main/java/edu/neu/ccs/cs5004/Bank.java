package edu.neu.ccs.cs5004;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;


/**
 * The class Bank.
 */
public class Bank {

  private static final Integer DEPOSIT_LIMIT_BOUND = 2001;
  private static final Integer WITHDRAWAL_LIMIT_BOUND = 3001;
  private static final Integer ZERO = 0;
  private static final Integer FIVE = 5;
  private static final Integer TEN = 10;
  private Map<Integer, Key> clientKey;
  private Map<Integer, Integer> clientWithdrawal;
  private Map<Integer, Integer> clientDeposit;


  /**
   * Instantiates a new Bank.
   */
  public Bank() {
    this.clientKey = new HashMap<>();
    this.clientDeposit = new HashMap<>();
    this.clientWithdrawal = new HashMap<>();
  }

  /**
   * Instantiates a new Bank.
   *
   * @param clientKey the client key
   * @param clientWithdrawal the client withdrawal
   * @param clientDeposit the client deposit
   */
  public Bank(Map<Integer, Key> clientKey, Map<Integer, Integer> clientWithdrawal,
      Map<Integer, Integer> clientDeposit) {
    this.clientKey = clientKey;
    this.clientDeposit = clientWithdrawal;
    this.clientWithdrawal = clientDeposit;
  }

  /**
   * Gets client key.
   *
   * @return the client key
   */
  public Map<Integer, Key> getClientKey() {
    return clientKey;
  }

  /**
   * Gets client withdrawal.
   *
   * @return the client withdrawal
   */
  public Map<Integer, Integer> getClientWithdrawal() {
    return clientWithdrawal;
  }

  /**
   * Gets client deposit.
   *
   * @return the client deposit
   */
  public Map<Integer, Integer> getClientDeposit() {
    return clientDeposit;
  }

  /**
   * Add client.
   *
   * @param number the id
   * @param publicKey the public key
   */
  public void addClient(Integer number, Key publicKey) {
    clientKey.put(number, publicKey);
    Random random = new Random();
    clientDeposit.put(number, random.nextInt(DEPOSIT_LIMIT_BOUND));
    clientWithdrawal.put(number, random.nextInt(WITHDRAWAL_LIMIT_BOUND));
  }

  /**
   * Verify signature boolean.
   *
   * @param pair the pair
   * @param number the id num
   * @return the boolean
   */
  public boolean verifySignature(MessageSignPair pair, Integer number) {
    if (!clientKey.containsKey(number)) {
      throw new IllegalArgumentException("the client doesn't exist");
    }
    Key publicKey = clientKey.get(number);
    BigInteger numB = publicKey.getKeyCom1();
    BigInteger numN = publicKey.getKeyCom2();
    BigInteger msg = pair.getSignature().modPow(numB, numN);
    return pair.getMessage() == msg.intValue();
  }

  /**
   * Do transaction boolean.
   *
   * @param pair the pair
   * @param number the id num
   * @return the boolean
   */
  public boolean doTransaction(MessageSignPair pair, Integer number) {
    Integer msg = pair.getMessage();
    int lastDigit = msg % TEN;
    int amount = msg / TEN;
    if (lastDigit >= ZERO && lastDigit < FIVE) {
      // deposit
      if (!clientDeposit.containsKey(number)) {
        return false;
      }
      if (clientDeposit.get(number) >= amount) {
        clientDeposit.put(number, clientDeposit.get(number) - amount);
        return true;
      }
    } else if (TEN > lastDigit && lastDigit >= FIVE) {
      // withdraw
      if (!clientWithdrawal.containsKey(number)) {
        return false;
      }
      if (clientWithdrawal.get(number) >= amount) {
        clientWithdrawal.put(number, clientWithdrawal.get(number) - amount);
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Bank{"
        + "clientKey=" + clientKey
        + ", clientWithdrawal=" + clientWithdrawal
        + ", clientDeposit=" + clientDeposit
        + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Bank bank = (Bank) obj;
    return Objects.equals(clientKey, bank.clientKey)
        && Objects.equals(clientWithdrawal, bank.clientWithdrawal)
        && Objects.equals(clientDeposit, bank.clientDeposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientKey, clientWithdrawal, clientDeposit);
  }
}
