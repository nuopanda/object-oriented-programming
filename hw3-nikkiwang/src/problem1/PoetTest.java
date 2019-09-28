package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

public class PoetTest {

  private Poet poet1;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> award;

  @Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best poet 1984");
    award.add("best poet 1993");
    poet1 = new Poet(alice, 40, "1982-1994", BioArtists, award);
  }
  // other methods from subclass have been tested in Musician Test
}