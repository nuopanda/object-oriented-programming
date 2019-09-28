package problem1;

/**
 * Represents a class Name as with their details--firstName and lastName
 *
 * @author nikkiwang
 */
public class Name {

  private String firstName;
  private String lastName;

  /**
   * Create a name object.
   *
   * @param firstName -- first name
   * @param lastName -- last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Get first name.
   *
   * @return the firstName
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Get last name.
   *
   * @return the lastName
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Set first name.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Set last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
