package problem1;

import org.junit.Before;
import org.junit.Test;
import problem1.Owner;

import static org.junit.Assert.*;

/**
 * test the Owner class
 */
public class OwnerTest {
    private Owner owner;

    /**
     * create the object owner of Owner class
     */
    @Before
    public void setUp() throws Exception {
        owner = new Owner("John", "Green", "4128903743");
    }

    /**
     * test getFirstName method
     */
    @Test
    public void getFirstName() {
        assertEquals("John",owner.getFirstName());
    }

    /**
     * test getLastName method
     */
    @Test
    public void getLastName() {
        assertEquals("Green",owner.getLastName());
    }

    /**
     * test getPhone method
     */
    @Test
    public void getPhone() {
        assertEquals("4128903743",owner.getPhone());
    }

    /**
     * test setFirstName method
     */
    @Test
    public void setFirstName() {
        owner.setFirstName("Alice");
        assertEquals("Alice",owner.getFirstName());
    }

    /**
     * test setLastName method
     */
    @Test
    public void setLastName() {
        owner.setLastName("Bush");
        assertEquals("Bush",owner.getLastName());
    }

    /**
     * test setPhone method
     */
    @Test
    public void setPhone() {
        owner.setPhone("2137899032");
        assertEquals("2137899032",owner.getPhone());
    }
}