package problem1;

/* Represents an Person with the firstName and lastName

 */
public class Person {
    private String firstName;
    private String lastName;

    /*
    creates a new person given the person's firstName and lastName as Strings
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
    @return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /*
    return the lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /*
    set the firstName
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /*
    set the lastName
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
}