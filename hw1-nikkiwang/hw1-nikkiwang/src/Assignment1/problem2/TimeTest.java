package problem2;

import org.junit.Before;
import org.junit.Test;
import problem2.Time;

import static org.junit.Assert.*;

/**
 * test file for Time class
 */
public class TimeTest {
    private Time time;

    /**
     * create a new object time for Time
     */
    @Before
    public void setUp() throws Exception {
        time = new Time(12, 3, 2);
    }

    /**
     * test getHour method
     */
    @Test
    public void getHour() {
        assertEquals(12, time.getHour());
    }

    /**
     * test getMin method
     */
    @Test
    public void getMin() {
        assertEquals(3, time.getMin());
    }

    /**
     * test getSec method
     */
    @Test
    public void getSec() {
        assertEquals(2, time.getSec());
    }

    /**
     * test transSeconds method
     */
    @Test
    public void transSeconds() {
        assertEquals(43382, time.transSeconds());
    }

    /**
     * test setHour method
     */
    @Test
    public void setHour() {
        time.setHour(10);
        assertEquals(10, time.getHour());
    }

    /**
     * test setMin method
     */
    @Test
    public void setMin() {
        time.setMin(15);
        assertEquals(15, time.getMin());
    }

    /**
     * test setSec method
     */
    @Test
    public void setSec() {
        time.setSec(9);
        assertEquals(9, time.getSec());
    }
}