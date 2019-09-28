package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import problem2.Automobile;

public class TechnicalReportTest {

  private TechnicalReport technicalReport1;
  private Author author1;

  @Before
  public void setUp() throws Exception {
    author1 = new Author("Alice", "Green");
    technicalReport1 = new TechnicalReport("The function of autophagy", author1, 2018, 3425,
        "AACR");
  }

  // methods from superclass have been tested in ConferenceTest
  @Test
  public void getTrid() {
    assertEquals(3425, this.technicalReport1.getTrid());
  }

  @Test
  public void setTrid() {
    this.technicalReport1.setTrid(2990);
    assertEquals(2990, this.technicalReport1.getTrid());
  }

  @Test
  public void getInstitution() {
    assertEquals("AACR", this.technicalReport1.getInstitution());
  }

  @Test
  public void setInstitution() {
    this.technicalReport1.setInstitution("AAPS");
    assertEquals("AAPS", this.technicalReport1.getInstitution());
  }

  @Test
  public void createJournal() {
    Journal journal1 = this.technicalReport1.createJournal("Cancer Letter", 26, Month.Feb, 2019);
    assertEquals("Cancer Letter", journal1.getName());
    assertEquals(author1, journal1.getAuthor());
    assertEquals("The function of autophagy", journal1.getTitle());
    assertEquals(26, journal1.getIssue());
    assertEquals(Month.Feb, journal1.getMonth());
    assertEquals(2019, journal1.getYear());
    try {
      Journal journal2 = this.technicalReport1.createJournal("Cancer Letter", 26, Month.Feb, 219);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
  }
}