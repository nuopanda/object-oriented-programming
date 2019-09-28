package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepositTest {
    private Deposit deposit;

    @Before
    public void setUp() throws Exception {
        deposit = new Deposit("John", "Green", "123456789", 20, 50);
    }

    @Test
    public void getFirstName() {
        assertEquals("John", this.deposit.getFirstName());
    }

    @Test
    public void getConstructor() {
        try {
            Deposit deposit = new Deposit("John", "Green", "123456789", 0, 50);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Deposit deposit = new Deposit("John", "Green", "123456789", 201, 50);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Deposit deposit = new Deposit("John", "Green", "123456789", 201, -1);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Deposit deposit = new Deposit("John", "Green", "123456789", 201, 100);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
        try {
            Deposit deposit = new Deposit("John", "Green", "12345678", 201, 100);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void getLastName() {
        assertEquals("Green", this.deposit.getLastName());
    }

    @Test
    public void getCardNumber() {
        assertEquals("123456789", this.deposit.getCardNumber());
    }

    @Test
    public void getDollar() {
        assertEquals(20, this.deposit.getDollar());
    }

    @Test
    public void getCents() {
        assertEquals(50, this.deposit.getCents());
    }
}