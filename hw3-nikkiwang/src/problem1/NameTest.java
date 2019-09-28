package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {

  private Name name1;

  @Before
  public void setUp() throws Exception {
    name1 = new Name("Alice", "Green");
  }

  @Test
  public void getFirstName() {
    assertEquals("Alice", this.name1.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Green", this.name1.getLastName());
  }

  @Test
  public void setFirstName() {
    this.name1.setFirstName("Lisa");
    assertEquals("Lisa", this.name1.getFirstName());
  }

  @Test
  public void setLastName() {
    this.name1.setLastName("Green");
    assertEquals("Green", this.name1.getLastName());
  }
}