package edu.neu.ccs.cs5004;


import java.util.Objects;

/**
 * The class Client.
 */
public class Client {

  private Integer identifyNum;
  private RsaPair pair;

  /**
   * Instantiates a new Client.
   *
   * @param identifyNum the identify num
   * @param pair the pair
   */
  public Client(Integer identifyNum, RsaPair pair) {
    this.identifyNum = identifyNum;
    this.pair = pair;
  }

  /**
   * Gets identify num.
   *
   * @return the identify num
   */
  public Integer getIdentifyNum() {
    return identifyNum;
  }

  /**
   * Gets pair.
   *
   * @return the pair
   */
  public RsaPair getPair() {
    return pair;
  }

  @Override
  public String toString() {
    return "Client{"
        + "identifyNum="
        + identifyNum;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Client client = (Client) obj;
    return Objects.equals(identifyNum, client.identifyNum)
        && Objects.equals(pair, client.pair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifyNum, pair);
  }
}
