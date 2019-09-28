package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

public class FilmmakerTest {

  private Filmmaker filmmaker1;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> movies;
  private List<String> award;
  private List<String> series;
  private List<String> multimedia;

  @Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best filmmaker 2012");
    award.add("best filmmaker 2013");
    movies = new ArrayList<>();
    movies.add("star war");
    series = new ArrayList<>();
    series.add("Homeless");
    multimedia = new ArrayList<>();
    multimedia.add("youtube");
    multimedia.add("HBO");
    filmmaker1 = new Filmmaker(alice, 18, "2010-2013", BioArtists, award, movies, series,
        multimedia);
  }
  // other methods from subclass have been tested in ActorTest
}