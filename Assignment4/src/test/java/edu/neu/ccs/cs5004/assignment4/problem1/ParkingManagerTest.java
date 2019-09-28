package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Before;
import org.junit.Test;

public class ParkingManagerTest {

  private ParkingManager manager;
  private ParkingSpot parkingSpot1;
  private ParkingSpot parkingSpot2;
  private ParkingSpot parkingSpot3;
  private ParkingSpot parkingSpot4;
  private ParkingSpot parkingSpot5;
  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;
  private Vehicle vehicle4;

  @Before
  public void setUp() throws Exception {
    this.manager = new ParkingManager();
    parkingSpot1 = new ParkingSpot(SpotSize.small, UsageType.regular,
        ParkingStatus.available);
    parkingSpot2 = new ParkingSpot(SpotSize.medium, UsageType.regular,
        ParkingStatus.available);
    parkingSpot3 = new ParkingSpot(SpotSize.large, UsageType.regular,
        ParkingStatus.available);
    parkingSpot4 = new ParkingSpot(SpotSize.large, UsageType.disabilities,
        ParkingStatus.available);
    parkingSpot5 = new ParkingSpot(SpotSize.large, UsageType.regular,
        ParkingStatus.inUse);
    vehicle1 = new Vehicle(VehicleSize.small, VehicleType.regular);
    vehicle2 = new Vehicle(VehicleSize.medium, VehicleType.regular);
    vehicle3 = new Vehicle(VehicleSize.large, VehicleType.regular);
    vehicle4 = new Vehicle(VehicleSize.small, VehicleType.disability);
  }

  @Test
  public void testParkVehicle() throws Exception {
    try {
      boolean value = this.manager.parkVehicle(vehicle1, parkingSpot3);
      assertTrue(value);
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      boolean value = this.manager.parkVehicle(vehicle1, parkingSpot4);
      assertTrue(!value);
      fail("An exception should not have been thrown");
    } catch (Exception e) {

    }
    try {
      boolean value = this.manager.parkVehicle(vehicle1, parkingSpot5);
      assertTrue(!value);
      fail("An exception should not have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void testCheckStatus() throws Exception {
    try {
      boolean value = this.manager.checkStatus(vehicle1, parkingSpot3);
      assertTrue((value));
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      boolean value = this.manager.checkStatus(vehicle1, parkingSpot5);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void testCheckType() throws Exception {
    try {
      boolean value = this.manager.checkType(vehicle3, parkingSpot3);
      assertTrue((value));
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      boolean value = this.manager.checkType(vehicle4, parkingSpot4);
      assertTrue((value));
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }

    try {
      boolean value = this.manager.checkType(vehicle3, parkingSpot4);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void testCheckFitSize() throws Exception {
    try {
      boolean value = this.manager.checkFitSize(vehicle2, parkingSpot2);
      assertTrue((value));
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      boolean value = this.manager.checkFitSize(vehicle2, parkingSpot2);
      assertTrue((value));
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }

    try {
      boolean value = this.manager.checkFitSize(vehicle2, parkingSpot1);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }

  }
}