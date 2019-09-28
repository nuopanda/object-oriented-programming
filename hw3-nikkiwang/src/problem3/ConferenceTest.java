package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConferenceTest {

  private Conference conference1;
  private Author author1;
  private Location location1;

  @Before
  public void setUp() throws Exception {
    author1 = new Author("Alice", "Green");
    location1 = new Location("Seattle", "USA");
    conference1 = new Conference("The function of autophagy", author1, "DDW", location1, Month.Apr,
        2018);
  }

  @Test
  public void testConstructor() {
    try {
      Conference conference2 = new Conference("The function of autophagy", author1, "DDW",
          location1, Month.Apr, 208);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

  }

  @Test
  public void getTitle() {
    assertEquals("The function of autophagy", this.conference1.getTitle());
  }

  @Test
  public void getAuthor() {
    assertEquals(author1, this.conference1.getAuthor());
  }

  @Test
  public void getYear() {
    assertEquals(2018, this.conference1.getYear());
  }

  @Test
  public void setTitle() {
    this.conference1.setTitle("The function of cellular autophagy");
    assertEquals("The function of cellular autophagy", this.conference1.getTitle());
  }

  @Test
  public void setAuthor() {
    Author author2 = new Author("Harry", "Green");
    this.conference1.setAuthor(author2);
    assertEquals(author2, this.conference1.getAuthor());
  }

  @Test
  public void setYear() {
    this.conference1.setYear(2019);
    assertEquals(2019, this.conference1.getYear());
    try {
      this.conference1.setYear(209);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  public void getName() {
    assertEquals("DDW", this.conference1.getName());
  }

  @Test
  public void setName() {
    this.conference1.setName("UEG");
    assertEquals("UEG", this.conference1.getName());
  }

  @Test
  public void getLocation() {
    assertEquals(location1, this.conference1.getLocation());
  }

  @Test
  public void setLocation() {
    Location location2 = new Location("Chicago", "USA");
    this.conference1.setLocation(location2);
    assertEquals(location2, this.conference1.getLocation());
  }

  @Test
  public void getMonth() {
    assertEquals(Month.Apr, this.conference1.getMonth());
  }

  @Test
  public void setMonth() {
    this.conference1.setMonth(Month.Aug);
    assertEquals(Month.Aug, this.conference1.getMonth());
  }
}