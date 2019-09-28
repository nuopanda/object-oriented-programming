package problem2;

import static org.junit.Assert.*;

/**
 * test file of Bicyclist class
 */
public class BicyclistTest {
    private Bicyclist bicyclist;

    /**
     * creates a new object bicyclist for Bicyclist class
     */
    @org.junit.Before
    public void setUp() throws Exception {
        Time start = new Time(8, 20, 0);
        Time end = new Time(10, 9, 23);
        bicyclist = new Bicyclist("Alice", "Seattle", start, end);
    }

    /**
     * test getName method
     */
    @org.junit.Test
    public void getName() {
        assertEquals("Alice", bicyclist.getName());
    }

    /**
     * test getTeam method
     */
    @org.junit.Test
    public void getTeam() {
        assertEquals("Seattle", bicyclist.getTeam());
    }


    /**
     * test setName method
     */
    @org.junit.Test
    public void setName() {
        bicyclist.setName("Lily");
        assertEquals("Lily", bicyclist.getName());
    }

    /**
     * test setTeam method
     */
    @org.junit.Test
    public void setTeam() {
        bicyclist.setTeam("Houston");
        assertEquals("Houston", bicyclist.getTeam());
    }

    /**
     * test setStartTime method
     */
    @org.junit.Test
    public void setStartTime() {
        Time start = new Time(9, 2, 0);
        bicyclist.setStartTime(start);
        assertEquals(9, bicyclist.getStartTime().getHour());
        assertEquals(2, bicyclist.getStartTime().getMin());
        assertEquals(0, bicyclist.getStartTime().getSec());
    }

    /**
     * test setEndTime method
     */
    @org.junit.Test
    public void setEndTime() {
        Time end = new Time(11, 4, 23);
        bicyclist.setEndTime(end);
        assertEquals(11, bicyclist.getEndTime().getHour());
        assertEquals(4, bicyclist.getEndTime().getMin());
        assertEquals(23, bicyclist.getEndTime().getSec());
    }

    /**
     * test getDuration method
     */
    @org.junit.Test
    public void getDuration() {
        Time duration = bicyclist.getDuration();
        assertEquals(1, bicyclist.getDuration().getHour());
        assertEquals(49, bicyclist.getDuration().getMin());
        assertEquals(23, bicyclist.getDuration().getSec());
    }
}