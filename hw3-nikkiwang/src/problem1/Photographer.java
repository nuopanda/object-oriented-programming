package problem1;

import java.util.List;

/**
 * Represents a class Photographer as with their details--name, age, activeYears, genre, awards
 *
 * @author nikkiwang
 */
public class Photographer extends AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a Photographer object
   *
   * @param name -- Phtographer's name
   * @param age -- Phtographer's age
   * @param activeYears -- Phtographer's active years
   * @param genre -- Phtographer's genre
   * @param awards -- Phtographer's list of awards
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Photographer(Name name, int age, String activeYears, Genre genre, List<String> awards)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards);
  }
}
