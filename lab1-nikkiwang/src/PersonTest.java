import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person John;

    @Before
    public void setUp() throws Exception {
        John = new Person("John", "Lee");
    }

    @Test
    public void getFirstName() {
        assertEquals(John.getFirstName(), "John");
    }

    @Test
    public void getLastName() {
        assertEquals(John.getLastName(), "Lee");
    }

    @Test
    public void setFirstName() {
        John.setFirstName("Joe");
        assertEquals(John.getFirstName(), "Joe");
    }

    @Test
    public void setLastName() {
        John.setLastName("Green");
        assertEquals(John.getLastName(), "Green");
    }
}