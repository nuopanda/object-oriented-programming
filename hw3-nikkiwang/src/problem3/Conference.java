package problem3;

/**
 * Represents a class Conference as with their details--title, author, name, location, month, year
 *
 * @author nikkiwang
 */
public class Conference extends AbstractPublication {

  private String title;
  private Author author;
  private String name;
  private Location location;
  private Month month;
  private int year;

  /**
   * Construct an conference object.
   *
   * @param title -- conference's title
   * @param author -- conference's author
   * @param name -- conference's name
   * @param location -- conference's location
   * @param month -- conference's month
   * @param year -- conference's  year
   */
  public Conference(String title, Author author, String name, Location location, Month month,
      int year) {
    super(title, author, year);
    this.month = month;
    this.name = name;
    this.location = location;
  }

  /**
   * Get name.
   *
   * @return name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Set name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get location.
   *
   * @return location
   */
  public Location getLocation() {
    return this.location;
  }

  /**
   * Set location.
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Get month.
   *
   * @return month
   */
  public Month getMonth() {
    return this.month;
  }

  /**
   * Set month.
   */
  public void setMonth(Month month) {
    this.month = month;
  }

}
