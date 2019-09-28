import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {

    private Email joeEmail;

    @Before
    public void setUp() throws Exception {
        joeEmail = new Email("joe", "a.b.com");
    }

    @Test
    public void getLoginName() {
        assertEquals(joeEmail.getLoginName(), "joe");
    }

    @Test
    public void getDomain() {
        assertEquals(joeEmail.getDomain(), "a.b.com");
    }

    @Test
    public void setLoginName() {
        joeEmail.setLoginName("joe123");
        assertEquals(joeEmail.getLoginName(), "joe123");

    }

    @Test
    public void setDomain() {
        joeEmail.setDomain("@gmail");
        assertEquals(joeEmail.getDomain(), "@gmail");
    }
}