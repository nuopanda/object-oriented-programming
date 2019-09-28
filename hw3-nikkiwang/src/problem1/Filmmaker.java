package problem1;

import java.util.List;

/**
 * Represents a class Filmmaker as with their details--name, age, activeYears, genre, awards,
 * movies, series, multimedia
 *
 * @author nikkiwang
 */
public class Filmmaker extends AbstractADF {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a filmmaker object.
   *
   * @param name -- Filmmaker's name
   * @param age -- Filmmaker's age
   * @param activeYears -- Filmmaker's active years
   * @param genre -- Filmmaker's genre
   * @param awards -- Filmmaker's list of awards
   * @param movies -- Filmmaker's list of movies
   * @param series -- Filmmaker's list of series
   * @param multimedia -- Filmmaker's list of multimedia
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Filmmaker(Name name, int age, String activeYears, Genre genre, List<String> awards,
      List<String> movies, List<String> series, List<String> multimedia)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards, movies, series, multimedia);
  }
}
