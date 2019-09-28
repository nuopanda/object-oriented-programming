package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    private Restaurant superMeal;

    @Before
    public void setUp() throws Exception {
        this.superMeal = new Restaurant("SuperMeal", "222 Ellsword ave", true);
    }

    @Test
    public void getName() {
        assertEquals("SuperMeal", this.superMeal.getName());
    }

    @Test
    public void getAddress() {
        assertEquals("222 Ellsword ave", this.superMeal.getAddress());
    }

    @Test
    public void getIsOpen() {
        assertTrue(this.superMeal.getIsOpen());
    }

    @Test
    public void setName() {
        this.superMeal.setName("GreatMeal");
        assertEquals("GreatMeal", this.superMeal.getName());
    }

    @Test
    public void setAddress() {
        this.superMeal.setAddress("124 Newport Wy");
        assertEquals("124 Newport Wy", this.superMeal.getAddress());
    }

    @Test
    public void setOpen() {
        this.superMeal.setOpen(false);
        assertFalse(this.superMeal.getIsOpen());
    }
}