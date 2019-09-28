/**
 * Class Account, containing information about a account. This class
 * is used as a part of Problem 3.
 */
package problem3;

/**
 * Account is a simple object that has a firstName, lastName as Strings,
 * dollar and cents as int.
 */

public class Account {
    private String firstName;
    private String lastName;
    private int dollar;
    private int cents;

    /**
     * Constructor that creates a new owner object with the
     * specified firstName, lastName, dollar and cents.
     * @param holder  -- the AccountHolder of the Account object
     * @param amount  -- the Amount of the Account object
     */
    public Account(AccountHolder holder, Amount amount) {
        this.firstName = holder.getFirstName();
        this.lastName = holder.getLastName();
        this.dollar = amount.getDollor();
        this.cents = amount.getCents();
    }

    /**
     * @return firstName of Account object
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return lastName of Account object
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return dollar of the Account object
     */
    public int getDollar() {
        return this.dollar;
    }

    /**
     * @return cents of the Account object
     */
    public int getCents() {
        return this.cents;
    }

    /**
     * sets firstName of the Account object
     */
    public void setFirstName(AccountHolder newHolder) {
        this.firstName = newHolder.getFirstName();
    }

    /**
     * sets the lastName of the Account object
     */
    public void setLastName(AccountHolder newHolder) {
        this.lastName = newHolder.getLastName();
    }

    /**
     * sets the dollar of the Account object
     */
    public void setDollar(Amount amount) {
        this.dollar = amount.getDollor();
    }

    /**
     * sets the cents of the Account object
     */
    public void setCents(Amount amount) {
        this.cents = amount.getCents();
    }

    /**
     * @param depositAmount  -- the deposit Amount of Amount object
     * @return a new Account object with updated holder and amount objects
     */
    public Account deposit(Amount depositAmount) {
        int depositDollor = depositAmount.getDollor();
        int depositCents = depositAmount.getCents();
        int currWholeCents = (this.dollar + depositDollor) * 100 + (depositCents + this.cents);
        int currDollar = currWholeCents / 100;
        int currCents = currWholeCents % 100;
        Amount currAmount = new Amount(currDollar, currCents);
        AccountHolder holder = new AccountHolder(this.firstName, this.lastName);
        return new Account(holder, currAmount);
    }

    /**
     * @param withdrawalAmount  --the withdraw Amount of the Amount object
     * @return a new Account object with updated holder and amount objects
     */
    public Account withdraw(Amount withdrawalAmount) {
        int withdrawDollar = withdrawalAmount.getDollor();
        int withdrawCents = withdrawalAmount.getCents();
        int currWholeCents = (this.dollar - withdrawDollar) * 100 + (this.cents - withdrawCents);
        int currDollar = currWholeCents / 100;
        int currCents = currWholeCents % 100;
        Amount currAmount = new Amount(currDollar, currCents);
        AccountHolder holder = new AccountHolder(this.firstName, this.lastName);
        return new Account(holder, currAmount);
    }


}
