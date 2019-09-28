package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceTest {
    private Balance balance;

    @Before
    public void setUp() throws Exception {
        this.balance = new Balance(30, 10);
    }

    @Test
    public void getConstructor() {
        try {
            Balance balance = new Balance(-1, 50);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Balance balance = new Balance(0, -1);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Balance balance = new Balance(0, 100);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void deposit() {
        assertEquals(70, this.balance.deposit(40, 20).getDollar());
        assertEquals(30, this.balance.deposit(40, 20).getCents());
    }

    @Test
    public void getDollar() {
        assertEquals(30, this.balance.getDollar());
    }

    @Test
    public void getCents() {
        assertEquals(10, this.balance.getCents());
    }
}