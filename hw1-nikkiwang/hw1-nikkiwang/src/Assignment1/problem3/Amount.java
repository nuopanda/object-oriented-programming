/**
 * Class Amount, containing information about a Amount. This class
 * is used as a part of Problem 3.
 */
package problem3;

/**
 * Amount is a simple object that has a dollar and cents as int.
 */

public class Amount {
    private int dollor;
    private int cents;

    /**
     * Constructor that creates a new Amount object with the
     * specified dollar and cents.
     *
     * @param dollor -- dollar of the new Amount object, check if the dollar is valid.
     * @param cents  -- cents of the new Amount object, check if the cents is valid.
     */
    public Amount(int dollor, int cents) {
        if (dollor < 0) {
            throw new IllegalArgumentException("dollor " + dollor + " is not valid");
        }
        if (cents < 0 || cents > 99) {
            throw new IllegalArgumentException("dollor " + dollor + " is not valid");
        }
        this.dollor = dollor;
        this.cents = cents;
    }

    /**
     * @return the dollor of the Amount
     */
    public int getDollor() {
        return this.dollor;
    }

    /**
     * @return the cents of the Amount
     */
    public int getCents() {
        return this.cents;
    }

    /**
     * sets the dollor of the Amount
     */
    public void setDollor(int newDollor) {
        this.dollor = newDollor;
    }

    /**
     * sets the cents of the Amount
     */
    public void setCents(int newCents) {
        this.cents = newCents;
    }
}
