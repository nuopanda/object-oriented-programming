package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JournalTest {

  private Journal journal1;
  private Author author1;

  @Before
  public void setUp() throws Exception {
    author1 = new Author("Alice", "Green");
    journal1 = new Journal("The function of autophagy", author1, "Cancer Letter", 26, Month.Dec,
        2018);
  }
  // methods from superclass have been tested in ConferenceTest

  @Test
  public void getIssue() {
    assertEquals(26, this.journal1.getIssue());
  }

  @Test
  public void setIssue() {
    this.journal1.setIssue(29);
    assertEquals(29, this.journal1.getIssue());
  }

  @Test
  public void getName() {
    assertEquals("Cancer Letter", this.journal1.getName());
  }

  @Test
  public void setName() {
    this.journal1.setName("Oncology");
    assertEquals("Oncology", this.journal1.getName());
  }

  @Test
  public void getMonth() {
    assertEquals(Month.Dec, this.journal1.getMonth());
  }

  @Test
  public void setMonth() {
    this.journal1.setMonth(Month.Feb);
    assertEquals(Month.Feb, this.journal1.getMonth());
  }
}