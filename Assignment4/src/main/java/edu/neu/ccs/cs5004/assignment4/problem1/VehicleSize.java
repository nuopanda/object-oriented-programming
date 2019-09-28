package edu.neu.ccs.cs5004.assignment4.problem1;
/**
 * create enum VehicleSize.
 */
public enum VehicleSize {
  small(1), medium(2), large(3);
  private int size;
  /**
   * Create enum VehicleSize object.
   *
   * @param size -- VehicleSize's size
   */
  private VehicleSize(int size) {
    this.size = size;
  }
  /**
   * Get VehicleSize's size.
   *
   * @return VehicleSize's size
   */
  public int getEnumSize() {
    return this.size;
  }
}
