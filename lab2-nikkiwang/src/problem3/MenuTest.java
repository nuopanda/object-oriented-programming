package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        this.menu = new Menu("burger", "cake", "coke", "soda");
    }

    @Test
    public void getMeals() {
        assertEquals("burger", this.menu.getMeals());
    }

    @Test
    public void getDesserts() {
        assertEquals("cake", this.menu.getDesserts());
    }

    @Test
    public void getBeverages() {
        assertEquals("coke", this.menu.getBeverages());
    }

    @Test
    public void getDrinks() {
        assertEquals("soda", this.menu.getDrinks());
    }

    @Test
    public void setMeals() {
    }

    @Test
    public void setDesserts() {
    }

    @Test
    public void setBeverages() {
    }

    @Test
    public void setDrinks() {
    }
}