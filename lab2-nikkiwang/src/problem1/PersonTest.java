package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person jane;

    @Before
    public void setUp() throws Exception {
        this.jane = new Person("Jane", "Bush");
    }

    @Test
    public void getFirstName() {
        assertEquals("Jane", this.jane.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Bush", this.jane.getLastName());
    }

    @Test
    public void setFirstName() {
        this.jane.setFirstName("John");
        assertEquals("John", this.jane.getFirstName());
    }

    @Test
    public void setLastName() {
        this.jane.setLastName("Green");
        assertEquals("Green", this.jane.getLastName());
    }
}