public class Scratch {
    public static void main(String[] args) {
        Person John = new Person("John", "Lee");
        Email email = new Email("john123", "@gmail.com");
        Address address = new Address(12, " Ellsworth Ave ",
                "Pittsburgh,", "PA ",
                15213, " USA");
        Author author = new Author(John, email, address);
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getAddress());
    }
}
