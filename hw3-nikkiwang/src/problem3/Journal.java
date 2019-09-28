package problem3;

/**
 * Represents a class Journal as with their details--title, author, name, issue, month, year.
 *
 * @author nikkiwang
 */
public class Journal extends AbstractPublication {

  private String title;
  private Author author;
  private String name;
  private int issue;
  private Month month;
  private int year;

  /**
   * Construct a journal object.
   *
   * @param title -- journal's title
   * @param author -- journal's author
   * @param name -- journal's name
   * @param issue -- journal's issue
   * @param month -- journal's month
   * @param year -- journal's year
   */
  public Journal(String title, Author author, String name, int issue, Month month, int year) {
    super(title, author, year);
    this.name = name;
    this.issue = issue;
    this.month = month;
  }

  /**
   * Get issue.
   *
   * @return issue
   */
  public int getIssue() {
    return this.issue;
  }

  /**
   * Set issue.
   */
  public void setIssue(int issue) {
    this.issue = issue;
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
