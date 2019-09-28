package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents a class Record with their details - winNum, tieNum and lossNum.
 *
 * @author nikkiwang
 */
public class Record {

  private Integer winNum;
  private Integer tieNum;
  private Integer lossNum;

  /**
   * Create a Record object.
   */
  public Record() {
    this.winNum = 0;
    this.tieNum = 0;
    this.lossNum = 0;
  }

  /**
   * Get winNum.
   *
   * @return winNum
   */
  public Integer getWinNum() {
    return this.winNum;
  }

  /**
   * Add winNum.
   */
  public void addWinNum() {
    this.winNum += 1;
  }

  /**
   * Set tie num.
   *
   * @param newTie - new tie number
   */
  public void setTieNum(Integer newTie) {
    this.tieNum = newTie;
  }

  /**
   * Get tie num.
   *
   * @return tie num.
   */
  public Integer getTieNum() {
    return this.tieNum;
  }

  /**
   * Add tie num.
   */
  public void addTieNum() {
    this.tieNum += 1;
  }

  /**
   * Get loss num.
   *
   * @return loss num.
   */
  public Integer getLossNum() {
    return this.lossNum;
  }

  /**
   * Add loss num.
   */
  public void addLossNum() {
    this.lossNum += 1;
  }

}
