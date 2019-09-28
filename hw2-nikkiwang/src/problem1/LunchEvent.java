package problem1;

/**
 * Represents an LunchEvents as with their details--name, num, sandwichesNum
 *
 * @author nikkiwang
 */
public class LunchEvent extends Event {
    private double SANDWICH = 1.05;
    private int sandwichesNum;

    /**
     * Creates a new LunchEvents as a subclass of Event, given the name as String and num as int.
     *
     * @param name -- client name
     * @param num  -- attendees number
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public LunchEvent(String name, int num) throws IllegalArgumentException {
        super(name, num);
        if (num < 15 || num > 90) {
            throw new IllegalArgumentException("num of attendees is not valid");
        }
        this.sandwichesNum = this.getSandwiches();
    }

    /**
     * @return the number of sandwiches
     */
    public int getSandwiches() {
        return (int) (Math.round(this.num * SANDWICH));
    }

    /**
     * @return sandwichesNum
     */

    public int getSandwichesNum() {
        return this.sandwichesNum;
    }
}
