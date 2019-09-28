package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

  private Integer identifyNum;
  private Integer identifyNum2;
  private RsaPair pair;
  private RsaPair pair2;
  private Key privateKey;
  private Key privateKey2;
  private Key publicKey;
  private Client client;
  private Client client2;
  private Client client3;

  @Before
  public void setUp() throws Exception {
    identifyNum = 12345;
    identifyNum2 = 23455;
    privateKey = new Key(BigInteger.ONE, BigInteger.TEN);
    privateKey2 = new Key(BigInteger.ZERO, BigInteger.TEN);
    publicKey = new Key(BigInteger.TEN, BigInteger.TEN);
    pair = new RsaPair(privateKey, publicKey);
    pair2 = new RsaPair(privateKey2, publicKey);
    client = new Client(identifyNum, pair);
    client2 = new Client(identifyNum2, pair);
    client3 = new Client(identifyNum, pair2);

  }

  @Test
  public void getIdentifyNum() {
    assertEquals(identifyNum, client.getIdentifyNum());
  }

  @Test
  public void getPair() {
    assertEquals(pair, client.getPair());
  }

  @Test
  public void testToString() {
    assertEquals("Client{identifyNum=12345",
        client.toString());
  }

  @Test
  public void equals() {
    assertTrue(client.equals(client));
    assertFalse(client.equals(null));
    assertFalse(client.equals("test"));
    assertFalse(client.equals(client2));
    assertFalse(client.equals(client3));
  }

  @Test
  public void testHashCode() {
    assertEquals(client.hashCode(), client.hashCode());
    assertNotEquals(client.hashCode(), null);
    assertNotEquals(client.hashCode(), client2.hashCode());

  }
}