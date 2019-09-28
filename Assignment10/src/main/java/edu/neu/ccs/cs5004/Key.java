package edu.neu.ccs.cs5004;

import java.math.BigInteger;
import java.util.Objects;

/**
 * The class Key.
 */
public class Key {

  private BigInteger keyCom1;
  private BigInteger keyCom2;

  public Key(BigInteger keyCom1, BigInteger keyCom2) {
    this.keyCom1 = keyCom1;
    this.keyCom2 = keyCom2;
  }

  public BigInteger getKeyCom1() {
    return keyCom1;
  }

  public BigInteger getKeyCom2() {
    return keyCom2;
  }

  @Override
  public String toString() {
    return "Key{"
        + "keyCom1=" + keyCom1
        + ", keyCom2=" + keyCom2
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
    Key key = (Key) obj;
    return Objects.equals(keyCom1, key.keyCom1)
        && Objects.equals(keyCom2, key.keyCom2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyCom1, keyCom2);
  }
}
