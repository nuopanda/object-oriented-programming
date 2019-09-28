/**
 * Class Owner, containing information about a owner. This class
 * is used as a part of Problem 1.
 */
package problem1;

/**
 * Owner is a simple object that has a firstName, lastName and a phone number.
 */

public class Owner {
    private String firstName;
    private String lastName;
    private String phone;

    /**
     * Constructor that creates a new owner object with the
     * specified firstName, lastName and phone number.
     *
     * @param firstName - first Name of the new Owner object.
     * @param lastName  - last Name of the new Owner object.
     * @param phone     - phone number of the new Owner object.
     */
    public Owner(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

    }

    /**
     * Returns the first Name of the Owner.
     *
     * @return the firstName of the Owner.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the last Name of the Owner.
     *
     * @return the lastName of the Owner.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the phone number of the Owner.
     *
     * @return the phone of the Owner.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the first name of the owner.
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * Sets the last name of the owner.
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    /**
     * Sets the phone number of the owner.
     */
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
}
