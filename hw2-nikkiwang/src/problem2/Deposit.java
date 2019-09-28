package problem2;

/**
 * Represents a Deposit with their details--fistName, lastName, cardNumber, dollar and cents
 *
 * @author nikkiwang
 */
public class Deposit {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int dollar;
    private int cents;

    /**
     * Creates a new Deposit, given the fistName, lastName and cardNumber as Strings and dollar, cents as int
     *
     * @param firstName  -- Deposit's first name
     * @param lastName   -- Deposit's last name
     * @param cardNumber -- Deposit's card number
     * @param dollar     -- deposit amount (dollar)
     * @param cents      -- deposit amount (cents)
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public Deposit(String firstName, String lastName, String cardNumber, int dollar, int cents) throws IllegalArgumentException {
        if (dollar < 1 || dollar > 200 || cents < 0 || cents > 99)
            throw new IllegalArgumentException("Invalid deposit amount");
        if (cardNumber.length() != 9) throw new IllegalArgumentException("Invalid card number");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.dollar = dollar;
        this.cents = cents;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return cardNumber
     */
    public String getCardNumber() {
        return this.cardNumber;
    }

    /**
     * @return dollar
     */
    public int getDollar() {
        return this.dollar;
    }

    /**
     * @return cents
     */
    public int getCents() {
        return this.cents;
    }
}
