package problem1;

import java.util.List;

/**
 * Represents a class Dancer as with their details--name, age, activeYears, genre, awards, movies,
 * series, multimedia
 *
 * @author nikkiwang
 */
public class Dancer extends AbstractADF {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a dancer object.
   *
   * @param name -- Dancer's name
   * @param age -- Dancer's age
   * @param activeYears -- Dancer's active years
   * @param genre -- Dancer's genre
   * @param awards -- Dancer's list of awards
   * @param movies -- Dancer's list of movies
   * @param series -- Dancer's list of series
   * @param multimedia -- Dancer's list of multimedia
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public Dancer(Name name, int age, String activeYears, Genre genre, List<String> awards,
      List<String> movies, List<String> series, List<String> multimedia)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards, movies, series, multimedia);
  }
}
