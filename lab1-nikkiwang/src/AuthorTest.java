import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    private Author author;

    @Before
    public void setUp() throws Exception {
        Person p = new Person("Alice", "Green");
        Email pEmail = new Email("alice", "@gmail");
        Address pAddress = new Address(12, " Ellsworth Ave ",
                " Pittsburgh ", "PA ", 15213, " USA");
        author = new Author(p, pEmail, pAddress);
    }

    @Test
    public void getName() {
        assertEquals(author.getName(), "Alice Green");
    }

    @Test
    public void getEmail() {
        assertEquals(author.getEmail(), "alice@gmail");
    }

    @Test
    public void getAddress() {
        assertEquals(author.getAddress(), "12 Ellsworth Ave  Pittsburgh PA 15213 USA");
    }

    @Test
    public void setName() {
        Person t = new Person("John", "Oliver");
        author.setName(t);
        assertEquals(author.getName(), "John Oliver");
    }

    @Test
    public void setEmail() {
        Email tEmail = new Email("john", "@yahoo.com");
        author.setEmail(tEmail);
        assertEquals(author.getEmail(), "john@yahoo.com");
    }

    @Test
    public void setAddress() {
        Address tAddress = new Address(15, " Newport Way ",
                " Jersy City ", "NJ ", 76330, " USA");
        author.setAddress(tAddress);
        assertEquals(author.getAddress(), "15 Newport Way  Jersy City NJ 76330 USA");
    }
}