package problem1;

import java.util.List;

/**
 * Represents a class Musician as with their details--name, age, activeYears, genre, awards
 *
 * @author nikkiwang
 */
public class Musician extends AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a musician object.
   *
   * @param name -- Musician's name
   * @param age -- Musician's age
   * @param activeYears -- Musician's active years
   * @param genre -- Musician's genre
   * @param awards -- Musician'slist of awards
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Musician(Name name, int age, String activeYears, Genre genre, List<String> awards)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards);
  }
}
