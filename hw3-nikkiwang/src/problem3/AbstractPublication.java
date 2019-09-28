package problem3;

/**
 * Represents an Abstract class AbstractPublication as with their details--title, author and year
 *
 * @author nikkiwang
 */
public class AbstractPublication {

  private String title;
  private Author author;
  private int year;

  /**
   * Construct an abstractPulication object.
   *
   * @param title -- the publication's title
   * @param author -- the author's name
   * @param year -- the publication's year
   */
  public AbstractPublication(String title, Author author, int year)
      throws IllegalArgumentException {
    if (String.valueOf(year).length() != 4) {
      throw new IllegalArgumentException("invalid year");
    }
    this.title = title;
    this.author = author;
    this.year = year;

  }

  /**
   * Get title.
   *
   * @return title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Get author.
   *
   * @return author
   */
  public Author getAuthor() {
    return this.author;
  }


  /**
   * Get year.
   *
   * @return year
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Set title.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Set author.
   */
  public void setAuthor(Author author) {
    this.author = author;
  }


  /**
   * Set year.
   */
  public void setYear(int year) throws IllegalArgumentException {
    if (String.valueOf(year).length() != 4) {
      throw new IllegalArgumentException("invalid year");
    }
    this.year = year;
  }
}
