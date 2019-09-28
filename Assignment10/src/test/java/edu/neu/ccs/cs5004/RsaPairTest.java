package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class RsaPairTest {

  private Key privateKey;
  private Key publicKey;
  private RsaPair pair;
  private RsaPair pair2;
  private RsaPair pair3;
  private RsaPair pair4;
  private Key publicKey2;
  private Key privateKey3;
  private Key publicKey3;
  private Integer msg = 10000;

  @Before
  public void setUp() throws Exception {
    privateKey = new Key(BigInteger.valueOf(10), BigInteger.valueOf(3));
    publicKey = new Key(BigInteger.valueOf(5), BigInteger.valueOf(3));
    pair = new RsaPair(privateKey, publicKey);
    pair2 = new RsaPair();
    publicKey2 = pair2.getPublicKey();
    privateKey3 = new Key(BigInteger.valueOf(2), BigInteger.valueOf(3));
    publicKey3 = new Key(BigInteger.valueOf(15), BigInteger.valueOf(3));
    pair3 = new RsaPair(privateKey, publicKey3);
    pair4 = new RsaPair(privateKey3, publicKey);

  }

  @Test
  public void pairGenerator() {
    pair2.pairGenerator();
    assertNotEquals(publicKey2, pair2.getPublicKey());
  }

  @Test
  public void getPublicKey() {
    assertEquals(publicKey, pair.getPublicKey());

  }

  @Test
  public void getSignature() {
    assertFalse(BigInteger.valueOf(1) == pair.getSignature(msg));

  }

  @Test
  public void testToString() {
    assertEquals(
        "RsaPair{privateKey=Key{keyCom1=10, keyCom2=3}, publicKey=Key{keyCom1=5, keyCom2=3}}",
        pair.toString());
  }

  @Test
  public void equals() {
    assertTrue(pair.equals(pair));
    assertFalse(pair.equals(null));
    assertFalse(pair.equals("test"));
    assertFalse(pair.equals(pair3));
    assertFalse(pair.equals(pair4));
  }

  @Test
  public void testHashCode() {
    assertEquals(pair.hashCode(), pair.hashCode());
    assertNotEquals(pair.hashCode(), pair3.hashCode());
    assertNotEquals(pair.hashCode(), pair4.hashCode());
  }
}