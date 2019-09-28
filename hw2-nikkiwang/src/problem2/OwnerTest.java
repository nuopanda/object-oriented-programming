package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {
    private Owner john;

    @Before
    public void setUp() throws Exception {
        this.john = new Owner("john", "Green", "222 Ellsword Ave", "john@gmail.com");
    }

    @Test
    public void getFirstName() {
        assertEquals("john", this.john.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Green", this.john.getLastName());
    }
}