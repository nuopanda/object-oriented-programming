package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftCardTest {
    private GiftCard giftCard;
    private Owner john;
    private Balance balance;

    @Before
    public void setUp() throws Exception {
        john = new Owner("john", "Green", "224 ellsworth ave", "john@gmail.com");
        balance = new Balance(30, 10);
        this.giftCard = new GiftCard("123456789", john, balance);
    }

    @Test
    public void getConstructor() {
        try {
            GiftCard giftcard = new GiftCard("12345678", john, balance);
            fail("An exception should have been thrown");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void depositGift() {
        Deposit deposit = new Deposit("john", "Green", "123456789", 50, 90);
        this.giftCard.depositGift(deposit);
        assertEquals(81, this.giftCard.getBalance().getDollar());
        assertEquals(0, this.giftCard.getBalance().getCents());
    }
}