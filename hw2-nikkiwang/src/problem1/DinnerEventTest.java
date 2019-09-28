package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DinnerEventTest {
    private DinnerEvent dinnerEvent;

    @Before
    public void setUp() throws Exception {
        this.dinnerEvent = new DinnerEvent("John", 30);
    }

    @Test
    public void getConstructor() {
        try {
            DinnerEvent dinner = new DinnerEvent("Alice", 9);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

        try {
            DinnerEvent dinner = new DinnerEvent("Alice", 51);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }

    }
    @Test
    public void getNonVegetarian() {
        assertEquals(24, this.dinnerEvent.getNonVegetarian());
    }

    @Test
    public void getVegetarian() {
        assertEquals(6, this.dinnerEvent.getVegetarian());
    }

    @Test
    public void getNonVegeNum() {
        assertEquals(24, this.dinnerEvent.getNonVegeNum());
    }

    @Test
    public void getVegeNum() {
        assertEquals(6, this.dinnerEvent.getVegeNum());
    }
}