package edu.neu.ccs.cs5004.assignment4.problem1;

/**
 * Represents a class ParkingManager to implement the parkVehicle method.
 *
 * @author nikkiwang
 */

public class ParkingManager {

  /**
   * Create a ParkingManager object.
   */
  public ParkingManager() {

  }

  /**
   * check if valid parking, update the parking spot information.
   *
   * @param vehicle -- vehicle to be parked
   * @param parkingSpot -- parkingSpot to be used
   * @return boolean -- whether the vehicle can be parked
   * @throws Exception if checkStatus throws exception
   */
  public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
    if (!checkStatus(vehicle, parkingSpot)) {
      return false;
    }
    if (!checkType(vehicle, parkingSpot)) {
      return false;
    }
    if (!checkFitSize(vehicle, parkingSpot)) {
      return false;
    }
    parkingSpot.setStatus(ParkingStatus.inUse);
    return true;
  }

  /**
   * check if the status of parking is valid.
   *
   * @param vehicle -- vehicle to be parked
   * @param parkingSpot -- parkingSpot to be used
   * @return boolean -- whether the parkingSpot is available
   * @throws UnavailableSpotException if parkingSpot is in use
   */
  public boolean checkStatus(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
    if (parkingSpot.getStatus() == ParkingStatus.inUse) {
      throw new UnavailableSpotException("The parking spot is in use.");
    }
    return true;
  }

  /**
   * check if the types of parkingSpot and vehicle are consistent.
   *
   * @param vehicle -- vehicle to be parked
   * @param parkingSpot -- parkingSpot to be used
   * @return boolean -- whether the types of parkingSpot and vehicle are consistent.
   * @throws InvalidSpotTypeException if vehicle type is not consistent with parkingSpot
   */
  public boolean checkType(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
    if (parkingSpot.getType() == UsageType.disabilities
        && vehicle.getType() == VehicleType.regular) {
      throw new InvalidSpotTypeException("Invalid parking type.");
    }
    return true;
  }

  /**
   * check if the size of parkingSpot is fit for the vehicle.
   *
   * @param vehicle -- vehicle to be parked
   * @param parkingSpot -- parkingSpot to be used
   * @return boolean -- whether the the size of parkingSpot is fit for the vehicle.
   * @throws InvalidSpotSizeException if vehicle size is larger than parkingSpot size
   */
  public boolean checkFitSize(Vehicle vehicle, ParkingSpot parkingSpot) throws Exception {
    int vehicleSize = vehicle.getSize().getEnumSize();
    int spotSize = parkingSpot.getSize().getEnumSize();
    if (vehicleSize > spotSize) {
      throw new InvalidSpotSizeException("Invalid parking size.");
    }
    return true;
  }
}
