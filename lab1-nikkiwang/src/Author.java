/* Represents an Author with their details -- name, email and physical address
    @ author therapon

 */
public class Author {
    private String name;
    private String email;
    private String address;

    /* Creates a new author given the person as Person, email as Email and address ad Address.

      @param name the author's name
      @param email the author's email address
      @param address the authors physical address

     */
    public Author(Person person, Email email, Address address) {
        this.name = person.getFirstName() + " " + person.getLastName();
        this.email = email.getLoginName() + email.getDomain();
        this.address = address.getStreetNumber()
                + address.getStreetName()
                + address.getCityName()
                + address.getStateAcronym()
                + address.getZipCode()
                + address.getCountyName();
    }

    /*
    @return the name

     */
    public String getName() {
        return this.name;
    }

    /*
    @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /*
    return the address
     */
    public String getAddress() {
        return this.address;
    }

    /*
    set the name
     */
    public void setName(Person newPerson) {
        this.name = newPerson.getFirstName() + " " + newPerson.getLastName();
    }

    /*
    set the email
     */
    public void setEmail(Email newEmail) {
        this.email = newEmail.getLoginName() + newEmail.getDomain();
    }

    /*
    set the address
     */
    public void setAddress(Address newAddress) {
        this.address = newAddress.getStreetNumber()
                + newAddress.getStreetName()
                + newAddress.getCityName()
                + newAddress.getStateAcronym()
                + newAddress.getZipCode()
                + newAddress.getCountyName();
    }
}
