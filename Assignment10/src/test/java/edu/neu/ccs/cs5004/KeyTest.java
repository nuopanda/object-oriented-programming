package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;

public class KeyTest {

  private Key key;
  private Key key2;
  private Key key3;
  private BigInteger numA;
  private BigInteger numB;
  private BigInteger numC;


  @Before
  public void setUp() throws Exception {
    numA = BigInteger.ONE;
    numB = BigInteger.TEN;
    numC = BigInteger.ZERO;
    key = new Key(numA, numB);
    key2 = new Key(numA, numC);
    key3 = new Key(numC, numB);
  }

  @Test
  public void getKeyCom1() {
    assertEquals(numA, key.getKeyCom1());
  }

  @Test
  public void getKeyCom2() {
    assertEquals(numB, key.getKeyCom2());
  }

  @Test
  public void testToString() {
    assertEquals("Key{keyCom1=1, keyCom2=10}", key.toString());
  }

  @Test
  public void equals() {
    assertTrue(key.equals(key));
    assertFalse(key.equals(null));
    assertFalse(key.equals("test"));
    assertFalse(key.equals(key2));
    assertFalse(key.equals(key3));
  }

  @Test
  public void testHashCode() {
    assertEquals(key.hashCode(), key.hashCode());
    assertNotEquals(key.hashCode(), null);
    assertNotEquals(key.hashCode(), key2.hashCode());

  }
}