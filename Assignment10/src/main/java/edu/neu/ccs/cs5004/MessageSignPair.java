package edu.neu.ccs.cs5004;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Random;

/**
 * The class Message sign pair.
 */
public class MessageSignPair {

  private static final Integer HUNDRED = 100;
  private static final Integer MESSAGE_LIMIT_BOUND = 30001;
  private Integer message;
  private BigInteger signature;

  /**
   * Instantiates a new Message sign pair.
   *
   * @param client the client
   * @param invalidPercent the invalid percent
   */
  public MessageSignPair(Client client, double invalidPercent) {
    generatePair(client, invalidPercent);

  }

  /**
   * Instantiates a new Message sign pair.
   *
   * @param message the message
   * @param signature the signature
   */
  public MessageSignPair(Integer message, BigInteger signature) {
    this.message = message;
    this.signature = signature;
  }

  /**
   * Generate pair.
   *
   * @param client the client
   * @param invalidPercent the invalid percent
   */
  public void generatePair(Client client, double invalidPercent) {
    Random random = new Random();
    this.message = random.nextInt(MESSAGE_LIMIT_BOUND);
    boolean valid = HUNDRED * random.nextDouble() > invalidPercent;
    if (valid) {
      this.signature = client.getPair().getSignature(message);
    } else {
      this.signature = BigInteger.valueOf(random.nextInt());
    }
  }

  /**
   * Gets message.
   *
   * @return the message
   */
  public Integer getMessage() {
    return message;
  }

  /**
   * Gets signature.
   *
   * @return the signature
   */
  public BigInteger getSignature() {
    return signature;
  }

  @Override
  public String toString() {
    return "MessageSignPair{"
        + "message=" + message
        + ", signature=" + signature
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
    MessageSignPair that = (MessageSignPair) obj;
    return Objects.equals(message, that.message)
        && Objects.equals(signature, that.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, signature);
  }
}
