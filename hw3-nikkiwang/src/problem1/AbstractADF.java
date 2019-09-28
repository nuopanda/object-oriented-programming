package problem1;

import java.util.List;

/**
 * Represents an Abstract class AbstractADF as with their details--name, age, activeYears, genre,
 * awards, movies, series, multimedia
 *
 * @author nikkiwang
 */
public abstract class AbstractADF extends AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;
  private List<String> movies;
  private List<String> series;
  private List<String> multimedia;

  /**
   * Create a new abstract class AbstractADF as a subclass of AbstractArtist.
   *
   * @param name -- Actor or Dancer or Filmmaker's name
   * @param age -- Actor or Dancer or Filmmaker's age
   * @param activeYears -- Actor or Dancer or Filmmaker's active years
   * @param genre -- Actor or Dancer or Filmmaker's genre
   * @param awards -- Actor or Dancer or Filmmaker's list of awards
   * @param movies -- Actor or Dancer or Filmmaker's list of movies
   * @param series -- Actor or Dancer or Filmmaker's list of series
   * @param multimedia --Actor or Dancer or Filmmaker's list of multimedia
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public AbstractADF(Name name, int age, String activeYears, Genre genre, List<String> awards,
      List<String> movies, List<String> series, List<String> multimedia)
      throws IllegalArgumentException {
    super(name, age, activeYears, genre, awards);
    this.movies = movies;
    this.series = series;
    this.multimedia = multimedia;
  }

  /**
   * Get movies.
   *
   * @return the list of movies
   */
  public List<String> getMovies() {
    return this.movies;
  }

  /**
   * Get series.
   *
   * @return the list of series
   */
  public List<String> getSeries() {
    return this.series;
  }

  /**
   * Get multimedia.
   *
   * @return the list of multimedia
   */
  public List<String> getMultimedia() {
    return this.multimedia;
  }

  /**
   * Add movies.
   *
   * @param movie into the list the movies
   * @throws IllegalArgumentException if the movie has been recorded in the list
   */
  public void addMovies(String movie) throws IllegalArgumentException {
    if (this.movies.contains(movie)) {
      throw new IllegalArgumentException("this movie has been recorded");
    }
    this.movies.add(movie);
  }

  /**
   * Delete movies.
   *
   * @param movie from the list of movies
   * @throws IllegalArgumentException if the movie is not in the list of movies
   */
  public void deleteMovies(String movie) throws IllegalArgumentException {
    if (!this.movies.contains(movie)) {
      throw new IllegalArgumentException("this movie has not been recorded");
    }
    this.movies.remove(movie);
  }

  /**
   * Add series.
   *
   * @param series into the list the series
   * @throws IllegalArgumentException if the series has been recorded in the list
   */
  public void addSeries(String series) throws IllegalArgumentException {
    if (this.series.contains(series)) {
      throw new IllegalArgumentException("this series has been recorded");
    }
    this.series.add(series);
  }

  /**
   * Delete series.
   *
   * @param series from the list of series
   * @throws IllegalArgumentException if the series is not in the list of series
   */
  public void deleteSeries(String series) throws IllegalArgumentException {
    if (!this.series.contains(series)) {
      throw new IllegalArgumentException("this series has not been recorded");
    }
    this.series.remove(series);
  }

  /**
   * Add multimedia.
   *
   * @param multimedia into the list the multimedia
   * @throws IllegalArgumentException if the multimeida has been recorded in the list
   */
  public void addMultimedia(String multimedia) throws IllegalArgumentException {
    if (this.multimedia.contains(multimedia)) {
      throw new IllegalArgumentException("this multimedia has been recorded");
    }
    this.multimedia.add(multimedia);
  }

  /**
   * Delete multimedia.
   *
   * @param multimedia from the list of multimedia
   * @throws IllegalArgumentException if the multimedia is not in the list of multimedia
   */
  public void deleteMultimedia(String multimedia) throws IllegalArgumentException {

    {
      if (!this.multimedia.contains(multimedia)) {
        throw new IllegalArgumentException("this multimedia has not been recorded");
      }
      this.multimedia.remove(multimedia);
    }
  }

  /**
   * Set movies.
   */
  public void setMovies(List<String> newMovies) {
    this.movies = newMovies;
  }

  /**
   * Set series.
   */
  public void setSeries(List<String> newSeries) {
    this.series = newSeries;
  }

  /**
   * Set multimedia.
   */
  public void setMultimedia(List<String> newMultimedia) {
    this.multimedia = newMultimedia;
  }
}
