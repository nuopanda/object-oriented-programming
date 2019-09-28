package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

  private Vehicle vehicle;

  @Before
  public void setUp() throws Exception {
    this.vehicle = new Vehicle(VehicleSize.small, VehicleType.regular);
  }

  @Test
  public void getType() {
    assertEquals(VehicleType.regular, this.vehicle.getType());
  }

  @Test
  public void setType() {
    this.vehicle.setType(VehicleType.disability);
    assertEquals(VehicleType.disability, this.vehicle.getType());
  }

  @Test
  public void getSize() {
    assertEquals(VehicleSize.small, this.vehicle.getSize());
  }

  @Test
  public void setSize() {
    this.vehicle.setSize(VehicleSize.medium);
    assertEquals(VehicleSize.medium, this.vehicle.getSize());
  }
}