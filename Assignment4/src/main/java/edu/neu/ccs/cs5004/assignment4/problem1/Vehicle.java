package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * Represents a class Vehicle with its size, type.
 *
 * @author nikkiwang
 */
public class Vehicle {

  private VehicleSize size;
  private VehicleType type;

  /**
   * Create a Vehicle object.
   *
   * @param size -- vehicle's size
   * @param type -- vehicle's type
   */
  public Vehicle(VehicleSize size, VehicleType type) {
    this.size = size;
    this.type = type;
  }

  /**
   * Get the vehicle's type.
   *
   * @return VehicleType
   */
  public VehicleType getType() {
    return this.type;
  }

  /**
   * Set the vehicle's type.
   *
   * @param newType -- vehicle type
   */
  public void setType(VehicleType newType) {
    this.type = newType;
  }

  /**
   * Get the vehicle's size.
   *
   * @return VehicleSize
   */
  public VehicleSize getSize() {
    return this.size;
  }

  /**
   * Set the vehicle's size.
   *
   * @param newSize -- vehicle size
   */
  public void setSize(VehicleSize newSize) {
    this.size = newSize;
  }
}
