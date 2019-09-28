package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * Represents a class ParkingSpot with its size, type and status.
 *
 * @author nikkiwang
 */

public class ParkingSpot {

  private SpotSize size;
  private UsageType type;
  private ParkingStatus status;

  /**
   * Create a ParkingSpot object.
   *
   * @param size -- parkingSpot's size
   * @param type -- parkingSpot's type
   * @param status -- parkingSpot's status
   */
  public ParkingSpot(SpotSize size, UsageType type, ParkingStatus status) {
    this.size = size;
    this.type = type;
    this.status = status;
  }

  /**
   * Get the parkingSpot size.
   *
   * @return SpotSize
   */
  public SpotSize getSize() {
    return this.size;
  }

  /**
   * Set the parkingSpot size.
   *
   * @param newSize -- new SpotSize
   */
  public void setSize(SpotSize newSize) {
    this.size = newSize;
  }

  /**
   * Get the parkingSpot type.
   *
   * @return UsageSize
   */
  public UsageType getType() {
    return this.type;
  }

  /**
   * Set the parkingSpot usage type.
   *
   * @param newType -- new UsageType
   */
  public void setType(UsageType newType) {
    this.type = newType;
  }

  /**
   * Get the parkingSpot status.
   *
   * @return ParkingStatus
   */
  public ParkingStatus getStatus() {
    return this.status;
  }

  /**
   * Set the parkingSpot status.
   *
   * @param newStatus -- new ParkingStatus
   */
  public void setStatus(ParkingStatus newStatus) {
    this.status = newStatus;
  }

}
