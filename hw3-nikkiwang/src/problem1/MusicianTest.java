package problem1;

import static org.junit.Assert.*;

import com.sun.tools.javah.Gen;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class MusicianTest {

  private Musician musician1;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> award;

  @Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best musician 1984");
    award.add("best musician 1993");
    musician1 = new Musician(alice, 40, "1982-1994", BioArtists, award);
  }

  @Test
  public void getFirstName() {
    assertEquals("Alice", this.musician1.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Green", this.musician1.getLastName());
  }

  @Test
  public void getAge() {
    assertEquals(40, this.musician1.getAge());
  }

  @Test
  public void getActiveYears() {
    assertEquals("1982-1994", this.musician1.getActiveYears());
  }

  @Test
  public void getGenre() {
    assertEquals(BioArtists, this.musician1.getGenre());
  }

  @Test
  public void getAwards() {
    assertEquals(award, this.musician1.getAwards());

  }

  @Test
  public void setName() {
    Name name2 = new Name("Lisa", "Green");
    this.musician1.setName(name2);
    assertEquals("Lisa", this.musician1.getFirstName());
    assertEquals("Green", this.musician1.getLastName());
  }

  @Test
  public void setAge() {
    this.musician1.setAge(60);
    assertEquals(60, this.musician1.getAge());
  }

  @Test
  public void setActiveYears() {
    this.musician1.setActiveYears("1982-2000");
    assertEquals("1982-2000", this.musician1.getActiveYears());
  }

  @Test
  public void setGenre() {
    this.musician1.setGenre(Genre.Abstractartists);
    assertEquals(Genre.Abstractartists, this.musician1.getGenre());
  }

  @Test
  public void addAwards() {
    try {
      this.musician1.addAwards("best musician 1993");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.musician1.addAwards("best musician 1992");
    assertThat(this.musician1.getAwards(), CoreMatchers
        .hasItems("best musician 1984", "best musician 1992", "best musician 1993"));
  }

  @Test
  public void deleteAwards() {
    try {
      this.musician1.deleteAwards("best musician 1992");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.musician1.deleteAwards("best musician 1993");
    assertThat(this.musician1.getAwards(), CoreMatchers.hasItems("best musician 1984"));
  }

  @Test
  public void setAwards() {
    List<String> newAward = new ArrayList<>();
    newAward.add("best musician 1990");
    this.musician1.setAwards(newAward);
    assertEquals(newAward, this.musician1.getAwards());
  }
}