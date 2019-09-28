package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakeAndModelTest {

  private MakeAndModel makeAndModel;

  @Before
  public void setUp() throws Exception {
    makeAndModel = new MakeAndModel("Audi", "Q5");
  }

  @Test
  public void getMake() {
    assertEquals("Audi", this.makeAndModel.getMake());
  }

  @Test
  public void setMake() {
    this.makeAndModel.setMake("BMW");
    assertEquals("BMW", this.makeAndModel.getMake());
  }

  @Test
  public void getModel() {
    assertEquals("Q5", this.makeAndModel.getModel());
  }

  @Test
  public void setModel() {
    this.makeAndModel.setModel("A6");
    assertEquals("A6", this.makeAndModel.getModel());
  }
}