import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class Author2Test {
    private Author2 author;

    @Before
    public void setUp() throws Exception {
        author = new Author2("John Green", "john@gmail.com", "12 Ellsworth Ave  Pittsburgh PA 15213 USA");
    }

    @Test
    public void getName() {
        assertEquals(author.getName(), "John Green");
//        TestCase.fail("Not yet implemented");
    }

    @Test
    public void getEmail() {
        assertEquals(author.getEmail(), "john@gmail.com");
        //TestCase.fail("Not yet implemented");
    }

    @Test
    public void getAddress() {
        assertEquals(author.getAddress(), "12 Ellsworth Ave  Pittsburgh PA 15213 USA");
        //TestCase.fail("Not yet implemented");
    }

    @Test
    public void setName() {
        author.setName("Alice Green");
        assertEquals(author.getName(), "Alice Green");
        //TestCase.fail("Not yet implemented");
    }

    @Test
    public void setEmail() {
        author.setEmail("alice@yahoo.com");
        assertEquals(author.getEmail(), "alice@yahoo.com");
        //TestCase.fail("Not yet implemented");

    }

    @Test
    public void setAddress() {
        author.setAddress("15 Newport Way  Jersy City NJ 76330 USA");
        assertEquals(author.getAddress(), "15 Newport Way  Jersy City NJ 76330 USA");
        //TestCase.fail("Not yet implemented");
    }
}