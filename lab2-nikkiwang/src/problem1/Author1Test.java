package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Author1Test {
    private Author1 jane;

    @org.junit.Before
    public void setUp() throws Exception {
        this.jane = new Author1("Jane Doe", "j@a.com", "222 Main St, Seattle, WA, 98980");
    }


    @org.junit.Test
    public void getName() {
        assertEquals("Jane Doe", this.jane.getName());
    }

    @org.junit.Test
    public void getEmail() {
        assertEquals("j@a.com", this.jane.getEmail());
    }


    @org.junit.Test
    public void getAddress() {
        assertEquals("222 Main St, Seattle, WA, 98980", this.jane.getAddress());
    }
}