package problem3;

import static org.junit.Assert.*;

/**
 * test file of Account class
 */
public class AccountTest {
    private Account account;

    /**
     * creates a new Account object
     */
    @org.junit.Before
    public void setUp() throws Exception {
        AccountHolder holder = new AccountHolder("John", "Green");
        Amount amount = new Amount(100, 99);
        account = new Account(holder, amount);
    }

    /**
     * test the deposit method
     */
    @org.junit.Test
    public void deposit() {
        Amount deposit = new Amount(30, 2);
        Account afterDepositAccount = account.deposit(deposit);
        assertEquals(131,afterDepositAccount.getDollar());
        assertEquals(1,afterDepositAccount.getCents());
        assertEquals("John",afterDepositAccount.getFirstName());
        assertEquals("Green",afterDepositAccount.getLastName());

    }

    /**
     * test the withdraw method
     */
    @org.junit.Test
    public void withdraw() {
        Amount withdraw = new Amount(30, 2);
        Account afterWithdrawAccount = account.withdraw(withdraw);
        assertEquals(70,afterWithdrawAccount.getDollar());
        assertEquals(97,afterWithdrawAccount.getCents());
        assertEquals("John",afterWithdrawAccount.getFirstName());
        assertEquals("Green",afterWithdrawAccount.getLastName());
    }

    /**
     * test the getFirstName method
     */
    @org.junit.Test
    public void getFirstName() {
        assertEquals("John",account.getFirstName());
    }

    /**
     * test the getLastName method
     */
    @org.junit.Test
    public void getLastName() {
        assertEquals("Green",account.getLastName());
    }

    /**
     * test the getDollar method
     */
    @org.junit.Test
    public void getDollar() {
        assertEquals(100,account.getDollar());
    }

    /**
     * test the getCents method
     */
    @org.junit.Test
    public void getCents() {
        assertEquals(99,account.getCents());
    }

    /**
     * test the setFirstName method
     */
    @org.junit.Test
    public void setFirstName() {
        AccountHolder newHolder = new AccountHolder("Alice", "Bush");
        account.setFirstName(newHolder);
        assertEquals("Alice",account.getFirstName());
    }

    /**
     * test the setLastName method
     */
    @org.junit.Test
    public void setLastName() {
        AccountHolder newHolder = new AccountHolder("Alice", "Bush");
        account.setLastName(newHolder);
        assertEquals("Bush",account.getLastName());
    }

    /**
     * test the setDollar method
     */
    @org.junit.Test
    public void setDollar() {
        Amount newAmount = new Amount(30, 8);
        account.setDollar(newAmount);
        assertEquals(30,account.getDollar());
    }

    /**
     * test the setCents method
     */
    @org.junit.Test
    public void setCents() {
        Amount newAmount = new Amount(30, 8);
        account.setCents(newAmount);
        assertEquals(8,account.getCents());
    }
}