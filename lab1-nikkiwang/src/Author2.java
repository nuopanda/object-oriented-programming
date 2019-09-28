public class Author2 {
    private String name;
    private String email;
    private String address;

    /* Creates a new author given the author's name, email and address as strings

      @param name the author's name
      @param email the author's email address
      @param address the authors physical address

     */
    public Author2(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
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
    public void setName(String newName) {
        this.name = newName;
    }

    /*
    set the email
     */
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    /*
    set the address
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
}
