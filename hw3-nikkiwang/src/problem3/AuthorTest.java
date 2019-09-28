package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

  private Author author1;

  @Before
  public void setUp() throws Exception {
    author1 = new Author("Jane", "Green");
  }

  @Test
  public void getFirstName() {
    assertEquals("Jane", this.author1.getFirstName());
  }

  @Test
  public void setFirstName() {
    this.author1.setFirstName("Alice");
    assertEquals("Alice", this.author1.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Green", this.author1.getLastName());
  }

  @Test
  public void setLastName() {
    this.author1.setLastName("Whale");
    assertEquals("Whale", this.author1.getLastName());
  }
}