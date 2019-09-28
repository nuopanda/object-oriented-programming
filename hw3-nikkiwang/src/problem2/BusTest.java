package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BusTest {

  private Bus bus;
  private MakeAndModel makeAndModel = new MakeAndModel("Ford", "bus001");

  @Before
  public void setUp() throws Exception {
    this.bus = new Bus("White", makeAndModel, "162-ZOZ", (double) 50, Direction.Northbound);
  }

  @Test
  public void testConstructor() {
    try {
      Bus bus1 = new Bus("White", new MakeAndModel("Honda", "buscar1"), "162-Z1Z", (double) 90,
          Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      Bus bus2 = new Bus("White", new MakeAndModel("Honda", "buscar1"), "162-Z1Z", (double) -10,
          Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void testAcceleration() throws Exception {
    try {
      this.bus.acceleration(20);
      assertEquals((double) 60, this.bus.getVelocity(), 0.001);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      this.bus.acceleration(5);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.bus.acceleration(100);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.bus.acceleration(40);
      fail("An exception should have been thrown");
    } catch (InvalidAccelerationException e) {

    }
  }
  // other methods have been tested in AutomobileTest
}