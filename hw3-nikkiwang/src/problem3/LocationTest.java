package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LocationTest {

  private Location location1;

  @Before
  public void setUp() throws Exception {
    location1 = new Location("Chicago", "USA");
  }

  @Test
  public void getCity() {
    assertEquals("Chicago", this.location1.getCity());
  }

  @Test
  public void setCity() {
    this.location1.setCity("Seattle");
    assertEquals("Seattle", this.location1.getCity());
  }

  @Test
  public void getCountry() {
    assertEquals("USA", this.location1.getCountry());
  }

  @Test
  public void setCountry() {
    this.location1.setCountry("Canada");
    assertEquals("Canada", this.location1.getCountry());
  }
}