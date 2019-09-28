package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorcycleTest {

  private Motorcycle motorcycle;
  private MakeAndModel makeAndModel = new MakeAndModel("Halley", "motor001");

  @Before
  public void setUp() throws Exception {
    this.motorcycle = new Motorcycle("Red", makeAndModel, "162-Z0Z", (double) 50,
        Direction.Northbound);
  }

  @Test
  public void testConstructor() {
    try {
      Motorcycle motorcycle1 = new Motorcycle("White", makeAndModel, "162-Z1Z", (double) 50,
          Direction.Westbound);
    } catch (Exception e) {
      fail("An exception should not have been thrown");
    }
    try {
      Motorcycle motorcycle1 = new Motorcycle("White", makeAndModel, "162-Z1Z", (double) 90,
          Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      Motorcycle motorcycle2 = new Motorcycle("White", makeAndModel, "162-Z1Z",
          (double) -10, Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void acceleration() throws Exception {
    try {
      this.motorcycle.acceleration(20);
      assertEquals((double) 60, this.motorcycle.getVelocity(), 0.001);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      this.motorcycle.acceleration(5);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.motorcycle.acceleration(100);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.motorcycle.acceleration(40);
      fail("An exception should have been thrown");
    } catch (InvalidAccelerationException e) {

    }
  }
  // other methods have been tested in AutomobileTest
}