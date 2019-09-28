package problem1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

public class PainterTest {

  private Painter painter1;
  private Name alice = new Name("Alice", "Green");
  private Genre BioArtists;
  private List<String> award;

  @Before
  public void setUp() throws Exception {
    award = new ArrayList<>();
    award.add("best painter 1984");
    award.add("best painter 1993");
    painter1 = new Painter(alice, 40, "1982-1994", BioArtists, award);
  }
  // other methods from subclass have been tested in Musician Test
}