package edu.neu.ccs.cs5004;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

/**
 * The class Rsa pair.
 */
public class RsaPair {

  private static final Integer BIT_LENGTH = 32;
  private Key privateKey;
  private Key publicKey;
  private BigInteger numA = BigInteger.ZERO;
  private BigInteger numB = BigInteger.ZERO;
  private BigInteger numN = BigInteger.ZERO;

  /**
   * Instantiates a new Rsa pair.
   */
  public RsaPair() {
    pairGenerator();
  }

  /**
   * Instantiates a new Rsa pair.
   *
   * @param privateKey the private key
   * @param publicKey the public key
   */
  public RsaPair(Key privateKey, Key publicKey) {
    this.publicKey = publicKey;
    this.privateKey = privateKey;
  }

  /**
   * Pair generator.
   */
  public void pairGenerator() {
    // reference:https://www.nayuki.io/page/java-biginteger-was-made-for-rsa-cryptography
    // Generate random primes
    Random rand = new SecureRandom();
    BigInteger numP = BigInteger.probablePrime(BIT_LENGTH, rand);
    BigInteger numQ = BigInteger.probablePrime(BIT_LENGTH, rand);
    // Calculate products
    numN = numP.multiply(numQ);
    BigInteger phi = numP.subtract(BigInteger.ONE)
        .multiply(numQ.subtract(BigInteger.ONE));
    // Generate public and private exponents
    do {
      numA = new BigInteger(phi.bitLength(), rand);
    } while (numA.compareTo(BigInteger.ONE) <= 0
        || numA.compareTo(phi) >= 0
        || !numA.gcd(numN).equals(BigInteger.ONE)
        || !numA.gcd(phi).equals(BigInteger.ONE));
    numB = numA.modInverse(phi);
    this.privateKey = new Key(numA, numN);
    this.publicKey = new Key(numB, numN);
  }

  /**
   * Gets public key.
   *
   * @return the public key
   */
  public Key getPublicKey() {
    return this.publicKey;
  }

  /**
   * Gets signature.
   *
   * @param message the message
   * @return the signature
   */
  public BigInteger getSignature(Integer message) {
    BigInteger msg = BigInteger.valueOf(message);
    BigInteger enc = msg.modPow(privateKey.getKeyCom1(), privateKey.getKeyCom2());
    return enc;
  }

  @Override
  public String toString() {
    return "RsaPair{"
        + "privateKey=" + privateKey
        + ", publicKey=" + publicKey
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
    RsaPair rsaPair = (RsaPair) obj;
    return Objects.equals(privateKey, rsaPair.privateKey)
        && Objects.equals(publicKey, rsaPair.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, publicKey);
  }
}





