package edu.neu.ccs.cs5004.assignment4.problem2;


/**
 * Represents a class Date with their details - month and day.
 *
 * @author nikkiwang
 */
public class Date {

  private int month;
  private int day;

  /**
   * Create a date object.
   *
   * @param month --month
   * @param day -- day
   * @throws Exception if month or day is invalid
   */
  public Date(int month, int day) throws Exception {
    if (month < 1 || month > 12 || day < 1 || day > 31) {
      throw new IllegalArgumentException("invalid date.");
    }
    this.month = month;
    this.day = day;
  }

  /**
   * Get month.
   *
   * @return month
   */
  public int getMonth() {
    return this.month;
  }

  /**
   * Get day.
   *
   * @return day
   */
  public int getDay() {
    return this.day;
  }
}
