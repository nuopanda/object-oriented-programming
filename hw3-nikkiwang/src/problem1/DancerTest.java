package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

public class DancerTest {

  private Dancer dancer1;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> movies;
  private List<String> award;
  private List<String> series;
  private List<String> multimedia;

  @Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best dancer 2012");
    award.add("best dancer 2013");
    movies = new ArrayList<>();
    movies.add("butterfly");
    series = new ArrayList<>();
    series.add("home");
    multimedia = new ArrayList<>();
    multimedia.add("music");
    multimedia.add("live show");
    dancer1 = new Dancer(alice, 18, "2010-2013", BioArtists, award, movies, series, multimedia);
  }
  // other methods from subclass have been tested in ActorTest
}