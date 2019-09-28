package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LunchEventTest {
    private LunchEvent lunchEvent;

    @Before
    public void setUp() throws Exception {
        this.lunchEvent = new LunchEvent("Alice", 18);
    }

    @Test
    public void getConstructor() {
        try {
            LunchEvent lunch = new LunchEvent("Alice", 14);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

        try {
            LunchEvent lunch = new LunchEvent("Alice", 91);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void getSandwiches() {
        assertEquals(19, this.lunchEvent.getSandwiches());
    }

    @Test
    public void getSandwichesNum() {
        assertEquals(19, this.lunchEvent.getSandwichesNum());
    }
}