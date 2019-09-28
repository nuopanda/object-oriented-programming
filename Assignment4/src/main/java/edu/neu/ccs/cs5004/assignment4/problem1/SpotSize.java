package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * create enum SpotSize.
 */
public enum SpotSize {
  small(1), medium(2), large(3);
  private int size;

  /**
   * Create enum SpotSize object.
   *
   * @param size -- Spotsize's size
   */
  private SpotSize(int size) {
    this.size = size;
  }

  /**
   * Get SpotSize's size.
   *
   * @return SpotSize's size
   */
  public int getEnumSize() {
    return this.size;
  }
}
