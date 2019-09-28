package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyEventsTest {

    private DailyEvents dailyEvents;

    @Before
    public void setUp() throws Exception {
        this.dailyEvents = new DailyEvents(20);
    }

    @Test
    public void createEvent() {
        Event newEvent = this.dailyEvents.createEvent("lunch", "John", 20);
        LunchEvent lunchEvent = (LunchEvent) newEvent;
        assertEquals("John", lunchEvent.getClientName());
        assertEquals(21, lunchEvent.getSandwichesNum());
        Event newEvent2 = this.dailyEvents.createEvent("dinner", "Alice", 30);
        DinnerEvent dinnerEvent = (DinnerEvent) newEvent2;
        assertEquals("Alice", dinnerEvent.getClientName());
        assertEquals(24, dinnerEvent.getNonVegeNum());
        assertEquals(6, dinnerEvent.getVegeNum());
    }

    @Test
    public void createEventTestIllegalCase() {
        try {
            Event newEvent1 = this.dailyEvents.createEvent("lunch", "John", 14);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

        try {
            Event newEvent2 = this.dailyEvents.createEvent("lunch", "John", 91);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

        try {
            Event newEvent3 = this.dailyEvents.createEvent("dinner", "John", 9);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

        try {
            Event newEvent4 = this.dailyEvents.createEvent("dinner", "John", 51);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
    }
}