package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EventTest {
    private Event event;

    @org.junit.Before
    public void setUp() throws Exception {
        this.event = new Event("John", 20);
    }

    @org.junit.Test
    public void getClientName() {
        assertEquals("John", this.event.getClientName());
    }

    @org.junit.Test
    public void getNum() {
        assertEquals(20, this.event.getNum());
    }
}