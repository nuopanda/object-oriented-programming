package edu.neu.ccs.cs5004.assignment4.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sun.awt.image.PixelConverter.UshortGray;

public class ParkingSpotTest {

  private ParkingSpot parkingSpot1;

  @Before
  public void setUp() throws Exception {
    this.parkingSpot1 = new ParkingSpot(SpotSize.small, UsageType.regular,
        ParkingStatus.available);
  }

  @Test
  public void getSize() {
    assertEquals(SpotSize.small, this.parkingSpot1.getSize());
  }

  @Test
  public void setSize() {
    this.parkingSpot1.setSize(SpotSize.medium);
    assertEquals(SpotSize.medium, this.parkingSpot1.getSize());
  }

  @Test
  public void getType() {
    assertEquals(UsageType.regular, this.parkingSpot1.getType());
  }

  @Test
  public void setType() {

    this.parkingSpot1.setType(UsageType.disabilities);
    assertEquals(UsageType.disabilities, this.parkingSpot1.getType());
  }

  @Test
  public void getStatus() {
    assertEquals(ParkingStatus.available, this.parkingSpot1.getStatus());
  }

  @Test
  public void setStatus() {
    this.parkingSpot1.setStatus(ParkingStatus.inUse);
    assertEquals(ParkingStatus.inUse, this.parkingSpot1.getStatus());
  }
}