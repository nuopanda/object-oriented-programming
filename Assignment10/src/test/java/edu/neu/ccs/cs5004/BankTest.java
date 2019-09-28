package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

  private Map<Integer, Key> clientKey;
  private Map<Integer, Key> clientKey2;
  private Key key1;
  private Key key2;
  private Map<Integer, Integer> clientWithdrawal;
  private Map<Integer, Integer> clientWithdrawal2;
  private Map<Integer, Integer> clientDeposit;
  private Map<Integer, Integer> clientDeposit2;
  private Bank bank;
  private Bank bank2;
  private Bank bank3;
  private Bank bank4;
  private Bank bank5;
  private MessageSignPair msgSignPair1;
  private MessageSignPair msgSignPair2;
  private MessageSignPair msgSignPair3;
  private MessageSignPair msgSignPair4;
  private Integer message1;
  private Integer message2;
  private Integer message3;
  private Integer message4;
  private BigInteger signature1;

  @Before
  public void setUp() throws Exception {
    key1 = new Key(BigInteger.ONE, BigInteger.TEN);
    key2 = new Key(BigInteger.ZERO, BigInteger.TEN);
    clientKey = new HashMap<>();
    clientKey.put(1200, key1);
    clientKey2 = new HashMap<>();
    clientKey2.put(1200, key2);
    clientWithdrawal = new HashMap<>();
    clientWithdrawal.put(1200, 200);
    clientWithdrawal2 = new HashMap<>();
    clientWithdrawal2.put(1200, 300);
    clientDeposit = new HashMap<>();
    clientDeposit.put(1200, 300);
    clientDeposit2 = new HashMap<>();
    clientDeposit2.put(1200, 200);
    bank = new Bank();
    bank2 = new Bank(clientKey, clientWithdrawal, clientDeposit);
    bank3 = new Bank(clientKey, clientWithdrawal2, clientDeposit);
    bank4 = new Bank(clientKey, clientWithdrawal, clientDeposit2);
    bank5 = new Bank(clientKey2, clientWithdrawal, clientDeposit);
    message1 = 105;
    message2 = 102;
    message3 = 9995;
    message4 = 9992;
    signature1 = BigInteger.valueOf(1111);
    msgSignPair1 = new MessageSignPair(message1, signature1);
    msgSignPair2 = new MessageSignPair(message2, signature1);
    msgSignPair3 = new MessageSignPair(message3, signature1);
    msgSignPair4 = new MessageSignPair(message4, signature1);
  }

  @Test
  public void addClient() {
    bank.addClient(1234, key1);
    assertEquals(bank.getClientKey().size(), 1);
    assertEquals(bank.getClientDeposit().size(), 1);
    assertEquals(bank.getClientWithdrawal().size(), 1);
  }

  @Test
  public void verifySignature() {
    try {
      bank2.verifySignature(msgSignPair1, 19);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    assertFalse(bank2.verifySignature(msgSignPair1, 1200));
  }

  @Test
  public void doTransaction() {
    assertFalse(bank2.doTransaction(msgSignPair1, 80));
    assertFalse(bank2.doTransaction(msgSignPair2, 80));
    assertTrue(bank2.doTransaction(msgSignPair1, 1200));
    assertFalse(bank2.doTransaction(msgSignPair3, 1200));
    assertTrue(bank2.doTransaction(msgSignPair2, 1200));
    assertFalse(bank2.doTransaction(msgSignPair4, 1200));
  }

  @Test
  public void testToString() {
    assertEquals(
        "Bank{clientKey={1200=Key{keyCom1=1, keyCom2=10}}, clientWithdrawal={1200=300}, clientDeposit={1200=200}}",
        bank2.toString());
  }

  @Test
  public void equals() {
    assertTrue(bank2.equals(bank2));
    assertFalse(bank2.equals(bank3));
    assertFalse(bank2.equals(bank4));
    assertFalse(bank2.equals(bank5));
    assertFalse(bank2.equals(null));
    assertFalse(bank2.equals("test"));
  }

  @Test
  public void testHashCode() {
    assertFalse(bank2.hashCode() == bank4.hashCode());
    assertFalse(bank2.hashCode() == bank3.hashCode());
    assertFalse(bank2.hashCode() == bank5.hashCode());
    assertTrue(bank2.hashCode() == bank2.hashCode());
  }
}