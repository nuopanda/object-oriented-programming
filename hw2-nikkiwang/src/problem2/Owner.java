package problem2;

/**
 * Represents a Owner with their details--firstName, lastName, address and email
 *
 * @author nikkiwang
 */
public class Owner {
    private String firstName;
    private String lastName;
    private String address;
    private String email;

    /**
     * Creates a new Owner, given the firstName, lastName, address and email as String.
     *
     * @param firstName -- the owner's first name
     * @param lastName  -- the owner's last name
     * @param address   -- the owner's address
     * @param email     -- the owner's email
     */
    public Owner(String firstName, String lastName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }
}
