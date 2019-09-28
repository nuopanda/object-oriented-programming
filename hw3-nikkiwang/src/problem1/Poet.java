package problem1;

import java.util.List;

/**
 * Represents a class Poet as with their details--name, age, activeYears, genre, awards
 *
 * @author nikkiwang
 */
public class Poet extends AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a Poet object.
   *
   * @param name -- Poet's name
   * @param age -- Poet's age
   * @param activeYears -- Poet's active years
   * @param genre -- Poet's genre
   * @param awards -- Poet's list of awards
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Poet(Name name, int age, String activeYears, Genre genre, List<String> awards)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards);
  }
}
