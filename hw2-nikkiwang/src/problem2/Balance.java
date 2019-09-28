package problem2;

/**
 * Represents a Balance with their details--dollar and cents
 *
 * @author nikkiwang
 */
public class Balance {
    private int dollar;
    private int cents;

    /**
     * Creates a new Balance, given the dollar and cents as int.
     *
     * @param dollar -- the dollar of balance
     * @param cents  -- the cents of balance
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public Balance(int dollar, int cents) throws IllegalArgumentException {
        if (dollar < 0 || cents < 0 || cents > 99) throw new IllegalArgumentException("invalid balance");
        this.dollar = dollar;
        this.cents = cents;
    }

    /**
     * @param depoistDollar -- the deposit dollar
     * @param depositCents  -- the deposit cents
     * @return
     */
    public Balance deposit(int depoistDollar, int depositCents) {
        int currWholeCents = (this.dollar + depoistDollar) * 100 + (depositCents + this.cents);
        int currDollar = currWholeCents / 100;
        int currCents = currWholeCents % 100;
        Balance currBalance = new Balance(currDollar, currCents);
        return currBalance;
    }

    /**
     * @return balance's dollar
     */
    public int getDollar() {
        return this.dollar;
    }

    /**
     * @return balance's cents
     */
    public int getCents() {
        return this.cents;
    }
}
