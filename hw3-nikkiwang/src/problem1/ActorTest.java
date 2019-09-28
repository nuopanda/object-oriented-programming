package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class ActorTest {

  private Actor actor;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> movies;
  private List<String> award;
  private List<String> series;
  private List<String> multimedia;

  @org.junit.Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best actor 2012");
    award.add("best actor 2013");
    movies = new ArrayList<>();
    movies.add("gone girl");
    movies.add("let's go");
    series = new ArrayList<>();
    series.add("home");
    series.add("earth");
    multimedia = new ArrayList<>();
    multimedia.add("music");
    multimedia.add("live show");

    this.actor = new Actor(alice, 18, "2010-2013", BioArtists, award, movies, series, multimedia);
  }

  @org.junit.Test
  public void testConstructor() {
    try {
      Actor actor1 = new Actor(alice, 18, "2010-2013", BioArtists, award, movies, series,
          multimedia);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      Actor actor2 = new Actor(alice, 18, "2010-200", BioArtists, award, movies, series,
          multimedia);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    try {
      Actor actor3 = new Actor(alice, 18, "2010-current", BioArtists, award, movies, series,
          multimedia);
    } catch (IllegalArgumentException e) {
      fail("An exception should not have been thrown");
    }
    try {
      Actor actor4 = new Actor(alice, 18, "2010-curr", BioArtists, award, movies, series,
          multimedia);
      fail("An exception should not have been thrown");
    } catch (IllegalArgumentException e) {

    }
    try {
      Actor actor5 = new Actor(alice, -1, "2010-2013", BioArtists, award, movies, series,
          multimedia);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    try {
      Actor actor6 = new Actor(alice, 148, "2010-2013", BioArtists, award, movies, series,
          multimedia);
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }

  }

  @org.junit.Test
  public void getMovies() {
    assertEquals(movies, this.actor.getMovies());
  }

  @org.junit.Test
  public void getSeries() {
    assertEquals(series, this.actor.getSeries());
  }

  @org.junit.Test
  public void getMultimedia() {
    assertEquals(multimedia, this.actor.getMultimedia());
  }

  @org.junit.Test
  public void setMovies() {
    List<String> newMovies = new ArrayList<>();
    newMovies.add("gone girl");
    newMovies.add("let's go");
    this.actor.setMovies(newMovies);
    assertEquals(newMovies, this.actor.getMovies());
  }

  @org.junit.Test
  public void setSeries() {
    List<String> newSeries = new ArrayList<>();
    newSeries.add("gone girl ii");
    newSeries.add("let's go ii");
    this.actor.setSeries(newSeries);
    assertEquals(newSeries, this.actor.getSeries());
  }

  @org.junit.Test
  public void setMultimedia() {
    List<String> newMultiMedia = new ArrayList<>();
    newMultiMedia.add("youtube");
    newMultiMedia.add("spotify");
    this.actor.setMultimedia(newMultiMedia);
    assertEquals(newMultiMedia, this.actor.getMultimedia());
  }

  @org.junit.Test
  public void getFirstName() {
    assertEquals("Alice", this.actor.getFirstName());
  }

  @org.junit.Test
  public void getLastName() {
    assertEquals("Green", this.actor.getLastName());
  }

  @org.junit.Test
  public void getAge() {
    assertEquals(18, this.actor.getAge());
  }

  @org.junit.Test
  public void getActiveYears() {
    assertEquals("2010-2013", this.actor.getActiveYears());
  }

  @org.junit.Test
  public void getGenre() {
    assertEquals(BioArtists, this.actor.getGenre());
  }


  @org.junit.Test
  public void getAwards() {
    assertEquals(award, this.actor.getAwards());
  }

  @org.junit.Test
  public void setAward() {
    List<String> newAward = new ArrayList<>();
    newAward.add("best actor 2020");
    this.actor.setAwards(newAward);
    assertEquals(newAward, this.actor.getAwards());
  }

  @org.junit.Test
  public void setName() {
    Name newName = new Name("Emma", "Green");
    this.actor.setName(newName);
    assertEquals("Emma", this.actor.getFirstName());
  }

  @org.junit.Test
  public void setAge() {
    this.actor.setAge(21);
    assertEquals(21, this.actor.getAge());
  }

  @org.junit.Test
  public void setActiveYears() {
    this.actor.setActiveYears("2010-2015");
    assertEquals("2010-2015", this.actor.getActiveYears());
  }

  @org.junit.Test
  public void setGenre() {
    this.actor.setGenre(Genre.Cartoonists);
    assertEquals(Genre.Cartoonists, this.actor.getGenre());
  }

  @org.junit.Test
  public void addAwards() {
    try {
      this.actor.addAwards("best actor 2012");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.addAwards("best actor 2015");
    assertThat(this.actor.getAwards(),
        CoreMatchers.hasItems("best actor 2012", "best actor 2013", "best actor 2015"));
  }

  @org.junit.Test
  public void deleteAwards() {
    try {
      this.actor.deleteAwards("best actor 2019");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.deleteAwards("best actor 2012");
    assertThat(this.actor.getAwards(), CoreMatchers.hasItems("best actor 2013"));
  }

  @org.junit.Test
  public void addMovies() {
    try {
      this.actor.addMovies("gone girl");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.addMovies("fantastic world");
    assertThat(this.actor.getMovies(),
        CoreMatchers.hasItems("gone girl", "let's go", "fantastic world"));
  }

  @org.junit.Test
  public void deleteMovies() {
    try {
      this.actor.deleteMovies("fantastic world");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.deleteMovies("gone girl");
    assertThat(this.actor.getMovies(), CoreMatchers.hasItems("let's go"));
  }

  @org.junit.Test
  public void addSeries() {
    try {
      this.actor.addSeries("earth");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.addSeries("world");
    assertThat(this.actor.getSeries(), CoreMatchers.hasItems("home", "earth", "world"));
  }

  @org.junit.Test
  public void deleteSeries() {
    try {
      this.actor.deleteSeries("world");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.deleteSeries("home");
    assertThat(this.actor.getSeries(), CoreMatchers.hasItems("earth"));
  }

  @org.junit.Test
  public void addMultimedia() {
    try {
      this.actor.addMultimedia("music");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.addMultimedia("youtube");
    assertThat(this.actor.getMultimedia(), CoreMatchers.hasItems("music", "live show", "youtube"));
  }

  @org.junit.Test
  public void deleteMultimedia() {
    try {
      this.actor.deleteMultimedia("youtube");
      fail("An exception should have been thrown");
    } catch (IllegalArgumentException e) {

    }
    this.actor.deleteMultimedia("music");
    assertThat(this.actor.getMultimedia(), CoreMatchers.hasItems("live show"));
  }

}