package problem3;

/**
 * Represents a class Author as with their details--firstName, lastName.
 *
 * @author nikkiwang
 */
public class Author {

  private String firstName;
  private String lastName;

  /**
   * Construct an author object with firstName and lastName.
   *
   * @param firstName -- author's firstName
   * @param lastName -- author's lastName
   */
  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Get first name.
   *
   * @return firstName
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Set first Name.
   */
  public void setFirstName(String newFirstName) {
    this.firstName = newFirstName;
  }

  /**
   * Get last Name.
   *
   * @return lastName
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Set last Name.
   */
  public void setLastName(String newLastName) {
    this.lastName = newLastName;
  }
}
