package problem1;

import java.util.List;

/**
 * Represents a class Painter as with their details--name, age, activeYears, genre, awards
 *
 * @author nikkiwang
 */
public class Painter extends AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a painter object.
   *
   * @param name -- Painter's name
   * @param age -- Painter's age
   * @param activeYears -- Painter's active years
   * @param genre -- Painter's genre
   * @param awards -- Painter's list of awards
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Painter(Name name, int age, String activeYears, Genre genre, List<String> awards)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards);
  }
}
