package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    private Author john;

    @Before
    public void setUp() throws Exception {
        this.john = new Author("John", "Bush", "john@gmail.com", "222 Aelle Ave");
    }

    @Test
    public void getEmail() {
        assertEquals("john@gmail.com", this.john.getEmail());
    }

    @Test
    public void getAddress() {
        assertEquals("222 Aelle Ave", this.john.getAddress());
    }

    @Test
    public void getFirstName() {
        assertEquals("John", this.john.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Bush", this.john.getLastName());
    }

    @Test
    public void setFirstName() {
        this.john.setFirstName("Alice");
        assertEquals("Alice", this.john.getFirstName());
    }

    @Test
    public void setLastName() {
        this.john.setLastName("Green");
        assertEquals("Green", this.john.getLastName());
    }
}