/**
 * Class AccountHolder, containing information about a account holder. This class
 * is used as a part of Problem 3.
 */
package problem3;

/**
 * Account holder is a simple object that has a firstName, lastName as Strings.
 */

public class AccountHolder {
    private String firstName;
    private String lastName;

    /**
     * Constructor that creates a new accountholder object with the
     * specified firstName, lastName.
     * @param firstName   -- the first Name of the accountholder
     * @param lastName    -- the last Name of the accountholder
     */
    public AccountHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the firstName of the AccountHolder
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return the lastName of the AccountHolder
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * sets the firstName of the AccountHolder
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * sets the lastName of the AccountHolder
     */
    public void setLastName(String newLastName) {
        this.firstName = newLastName;
    }
}

