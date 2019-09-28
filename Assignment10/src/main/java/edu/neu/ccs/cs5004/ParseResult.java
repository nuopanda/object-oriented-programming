package edu.neu.ccs.cs5004;

import java.util.Objects;

/**
 * The type Parse result.
 */
public class ParseResult {

  private Integer clientNum;
  private Integer verificationNum;
  private Double invalidPercent;
  private String output;

  /**
   * Instantiates a new Parse result.
   *
   * @param clientNum the client num
   * @param verificationNum the verification num
   * @param invalidPercent the invalid percent
   * @param output the output
   */
  public ParseResult(Integer clientNum, Integer verificationNum, Double invalidPercent,
      String output) {
    this.clientNum = clientNum;
    this.verificationNum = verificationNum;
    this.invalidPercent = invalidPercent;
    this.output = output;
  }

  /**
   * Gets client num.
   *
   * @return the client num
   */
  public Integer getClientNum() {
    return clientNum;
  }

  /**
   * Gets verification num.
   *
   * @return the verification num
   */
  public Integer getVerificationNum() {
    return verificationNum;
  }

  /**
   * Gets invalid percent.
   *
   * @return the invalid percent
   */
  public Double getInvalidPercent() {
    return invalidPercent;
  }

  /**
   * Gets output.
   *
   * @return the output
   */
  public String getOutput() {
    return output;
  }

  @Override
  public String toString() {
    return "ParseResult{"
        + "clientNum=" + clientNum
        + ", verificationNum=" + verificationNum
        + ", invalidPercent=" + invalidPercent
        + ", output='" + output + '\''
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
    ParseResult that = (ParseResult) obj;
    return Objects.equals(clientNum, that.clientNum)
        && Objects.equals(verificationNum, that.verificationNum)
        && Objects.equals(invalidPercent, that.invalidPercent)
        && Objects.equals(output, that.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientNum, verificationNum, invalidPercent, output);
  }
}
