package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TruckTest {

  private Truck truck;
  private MakeAndModel makeAndModel = new MakeAndModel("Ford", "truck001");

  @Before
  public void setUp() throws Exception {
    this.truck = new Truck("White", makeAndModel, "162-ZOZ", (double) 50, Direction.Northbound);
  }

  @Test
  public void testConstructor() {
    try {
      Truck truck1 = new Truck("White", new MakeAndModel("Honda", "buscar1"), "162-Z1Z",
          (double) 90,
          Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      Truck truck2 = new Truck("White", new MakeAndModel("Honda", "buscar1"), "162-Z1Z",
          (double) -10,
          Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void testAcceleration() throws Exception {
    try {
      this.truck.acceleration(20);
      assertEquals((double) 60, this.truck.getVelocity(), 0.001);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      this.truck.acceleration(5);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.truck.acceleration(100);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.truck.acceleration(40);
      fail("An exception should have been thrown");
    } catch (InvalidAccelerationException e) {

    }
  }
  // other methods have been tested in AutomobileTest
}