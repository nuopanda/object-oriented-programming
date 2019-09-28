package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class MessageSignPairTest {

  private MessageSignPair msgSignPair;
  private MessageSignPair msgSignPair1;
  private MessageSignPair msgSignPair2;
  private MessageSignPair msgSignPair3;
  private Integer message;
  private Integer message1;
  private Integer message2;
  private BigInteger signature;
  private BigInteger signature1;
  private BigInteger signature2;
  private double invalidPercent;
  private double invalidPercent2;
  private Integer identifyNum;
  private RsaPair pair;
  private Key privateKey;
  private Key publicKey;
  private Client client;


  @Before
  public void setUp() throws Exception {
    message1 = 1234;
    message2 = 1000;
    signature1 = BigInteger.valueOf(1111);
    signature2 = BigInteger.valueOf(1234);
    pair = new RsaPair();
    client = new Client(identifyNum, pair);
    msgSignPair = new MessageSignPair(client, invalidPercent);
    message = msgSignPair.getMessage();
    signature = msgSignPair.getSignature();
    msgSignPair1 = new MessageSignPair(message1, signature1);
    msgSignPair2 = new MessageSignPair(message1, signature2);
    msgSignPair3 = new MessageSignPair(message2, signature1);
    invalidPercent = 0.5;
    invalidPercent2 = 0.6;
    identifyNum = 12222;
    privateKey = new Key(BigInteger.valueOf(20), BigInteger.valueOf(30));
    publicKey = new Key(BigInteger.valueOf(100), BigInteger.valueOf(30));

  }

  @Test
  public void generatePair() {
    msgSignPair.generatePair(client, invalidPercent2);
    assertNotEquals(message, msgSignPair.getMessage());
    assertNotEquals(signature, msgSignPair.getSignature());
  }

  @Test
  public void getMessage() {
    assertEquals(message1, msgSignPair1.getMessage());
  }

  @Test
  public void getSignature() {
    assertEquals(signature1, msgSignPair1.getSignature());
  }

  @Test
  public void testToString() {
    assertEquals("MessageSignPair{message=1234, signature=1111}", msgSignPair1.toString());
  }

  @Test
  public void equals() {
    assertTrue(msgSignPair1.equals(msgSignPair1));
    assertFalse(msgSignPair1.equals(null));
    assertFalse(msgSignPair1.equals("test"));
    assertFalse(msgSignPair1.equals(msgSignPair2));
    assertFalse(msgSignPair1.equals(msgSignPair3));
  }

  @Test
  public void testHashCode() {
    assertEquals(msgSignPair1.hashCode(), msgSignPair1.hashCode());
    assertNotEquals(msgSignPair1.hashCode(), msgSignPair2.hashCode());
    assertNotEquals(msgSignPair1.hashCode(), msgSignPair3.hashCode());
    assertNotEquals(msgSignPair1.hashCode(), null);
  }
}