package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutomobileTest {

  private Automobile automobile;
  private MakeAndModel makeAndModel = new MakeAndModel("Audi", "A4 Sedan");

  @Before
  public void setUp() throws Exception {
    this.automobile = new Automobile("White", makeAndModel, "162-ZOZ", (double) 50,
        Direction.Westbound);

  }

  @Test
  public void testConstructor() throws Exception {
    try {
      Automobile automobile1 = new Automobile("White", new MakeAndModel("Audi", "A4 Sedan"),
          "162-ZOZ", (double) 90, Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
    try {
      Automobile automobile2 = new Automobile("White", new MakeAndModel("Audi", "A4 Sedan"),
          "162-ZOZ", (double) -10, Direction.Westbound);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void getColor() {
    assertEquals("White", this.automobile.getColor());
  }

  @Test
  public void setColor() {
    this.automobile.setColor("Black");
    assertEquals("Black", this.automobile.getColor());
  }

  @Test
  public void getMakeAndModel() {
    assertEquals(makeAndModel, this.automobile.getMakeAndModel());
  }

  @Test
  public void setMakeAndModel() {
    MakeAndModel newMakeAndModel = new MakeAndModel("Audi", "Q5");
    this.automobile.setMakeAndModel(newMakeAndModel);
    assertEquals(newMakeAndModel, this.automobile.getMakeAndModel());
  }

  @Test
  public void getLicense() {
    assertEquals("162-ZOZ", this.automobile.getLicense());
  }

  @Test
  public void setLicense() {
    this.automobile.setLicense("164-ZOZ");
    assertEquals("164-ZOZ", this.automobile.getLicense());
  }

  @Test
  public void getVelocity() {
    assertEquals((double) 50, this.automobile.getVelocity(), 0.001);
  }

  @Test
  public void setVelocity() {
    this.automobile.setVelocity(60);
    assertEquals((double) 60, this.automobile.getVelocity(), 0.001);
  }

  @Test
  public void getDirection() {
    assertEquals(Direction.Westbound, this.automobile.getDirection());
  }

  @Test
  public void setDirection() {
    this.automobile.setDirection(Direction.Eastbound);
    assertEquals(Direction.Eastbound, this.automobile.getDirection());
  }

  @Test
  public void testAcceleration() throws Exception {
    try {
      this.automobile.acceleration(20);
      assertEquals((double) 60, this.automobile.getVelocity(), 0.001);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      this.automobile.acceleration(5);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.acceleration(100);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.acceleration(40);
      fail("An exception should have been thrown");
    } catch (InvalidAccelerationException e) {

    }

  }

  @Test
  public void testDeceleration() throws Exception {
    this.automobile.deceleration(20);
    assertTrue(0 == (40 - this.automobile.getVelocity()));
    try {
      this.automobile.deceleration(5);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }

    try {
      this.automobile.deceleration(100);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }

    try {
      this.automobile.deceleration(90);
      fail("An exception should have been thrown");
    } catch (Exception e) {

    }
  }

  @Test
  public void changeDirection() {
    try {
      this.automobile.changeDirection(Direction.Eastbound);
      assertEquals(Direction.Eastbound, this.automobile.getDirection());
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.changeDirection(Direction.Northbound);
      fail("An exception should have thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.changeDirection(Direction.Westbound);
      assertEquals(Direction.Westbound, this.automobile.getDirection());
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.changeDirection(Direction.Southbound);
      System.out.print(this.automobile.getDirection());
      fail("An exception should have thrown");
    } catch (IllegalArgumentException e) {

    }

    try {
      this.automobile.changeDirection((Direction.Eastbound));
      assertEquals(Direction.Eastbound, this.automobile.getDirection());
    } catch (IllegalArgumentException e) {

    }

  }
}