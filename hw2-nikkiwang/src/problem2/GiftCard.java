package problem2;

/**
 * Represents a GiftCard with their details--cardNumber, owner, balance
 *
 * @author nikkiwang
 */

public class GiftCard {
    private String cardNumber;
    private Owner owner;
    private Balance balance;

    /**
     * Creates a new GiftCard, given the cardNumber as String, owner as Owner, balance as Balance.
     *
     * @param cardNumber -- the giftcard's card number
     * @param owner      -- the giftcard's owner
     * @param balance    -- the giftcard's balance
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public GiftCard(String cardNumber, Owner owner, Balance balance) throws IllegalArgumentException {
        if (cardNumber.length() != 9) throw new IllegalArgumentException("Invalid card number");
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.balance = balance;
    }

    /**
     * @param newGift -- the deposit
     * @throws IllegalArgumentException if there are any invalid cases
     *                update the balance of this gift card
     */
    public void depositGift(Deposit newGift) throws IllegalArgumentException {
        if (!this.owner.getFirstName().equals(newGift.getFirstName()))
            throw new IllegalArgumentException("first name is not matched.");
        if (!this.owner.getLastName().equals(newGift.getLastName()))
            throw new IllegalArgumentException("last name is not matched.");
        if (!this.cardNumber.equals(newGift.getCardNumber()))
            throw new IllegalArgumentException("card number is not matched.");
        this.balance = this.balance.deposit(newGift.getDollar(), newGift.getCents());
    }

    /**
     * @return the gift card's balance
     */
    public Balance getBalance() {
        return this.balance;
    }
}
