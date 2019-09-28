package problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Abstract class AbstractADF as with their details--name, age, activeYears, genre,
 * awards
 *
 * @author nikkiwang
 */
public abstract class AbstractArtist {

  private Name name;
  private int age;
  private String activeYears;
  private Genre genre;
  private List<String> awards;

  /**
   * Create a new abstract class AbstractADF.
   *
   * @param name -- Artist's name
   * @param age -- Artist's age
   * @param activeYears -- Artist's active years
   * @param genre -- Artist's genre
   * @param awards -- Artist's list of awards
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public AbstractArtist(Name name, int age, String activeYears, Genre genre, List<String> awards)
      throws IllegalArgumentException {
    if (age < 0 || age > 128) {
      throw new IllegalArgumentException("invalid age");
    }
    if (activeYears.length() != 9 && activeYears.length() != 12) {
      throw new IllegalArgumentException("invalid active year");
    }
    String[] years = activeYears.split("-");
    for (String year : years) {
      if (year.length() == 4) {
        if (year.equals("curr")) {
          throw new IllegalArgumentException("invalid active year");
        }
      } else if (year.length() != 4 && !year.equals("current")) {
        throw new IllegalArgumentException("invalid active year");
      }
    }
    this.name = name;
    this.age = age;
    this.activeYears = activeYears;
    this.genre = genre;
    this.awards = awards;
  }

  /**
   * Get first name.
   *
   * @return the firstName
   */
  public String getFirstName() {
    return this.name.getFirstName();
  }

  /**
   * Get last name.
   *
   * @return the lastName
   */
  public String getLastName() {
    return this.name.getLastName();
  }

  /**
   * Get age.
   *
   * @return the age
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Get active years.
   *
   * @return the active years
   */
  public String getActiveYears() {
    return this.activeYears;
  }

  /**
   * Get genre.
   *
   * @return the genre
   */
  public Genre getGenre() {
    return this.genre;
  }

  /**
   * Get list of awards.
   *
   * @return the list of awards
   */
  public List<String> getAwards() {
    return this.awards;
  }

  /**
   * Set name.
   */
  public void setName(Name name) {
    this.name = name;
  }

  /**
   * Set age.
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Set active years.
   */
  public void setActiveYears(String activeYears) {
    this.activeYears = activeYears;
  }

  /**
   * Set genre.
   */
  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  /**
   * Add awards.
   *
   * @param award into the list the awards
   * @throws IllegalArgumentException if the award has been recorded in the list
   */
  public void addAwards(String award) throws IllegalArgumentException {
    if (this.awards.contains(award)) {
      throw new IllegalArgumentException("this award has been recorded");
    }
    this.awards.add(award);
  }

  /**
   * Delete awards from the list.
   *
   * @param award from the list of awards
   * @throws IllegalArgumentException if the award is not in the list of awards
   */
  public void deleteAwards(String award) throws IllegalArgumentException {
    if (!this.awards.contains(award)) {
      throw new IllegalArgumentException("this award has not been recorded");
    }
    this.awards.remove(award);
  }

  /**
   * Set awards.
   */
  public void setAwards(List<String> newAwards) {
    this.awards = newAwards;
  }
}
