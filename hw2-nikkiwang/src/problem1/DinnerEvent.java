package problem1;

/**
 * Represents an DinnerEvents as with their details--name, num, nonVegeNum and vegeNum
 *
 * @author nikkiwang
 */
public class DinnerEvent extends Event {
    private double NONVEGE = 0.8;
    private double VEGE = 0.2;
    private int nonVegeNum;
    private int vegeNum;

    /**
     * Creates a new DinnerEvents as a subclass of Event, given the name as String and num as int.
     *
     * @param name -- client name
     * @param num  -- attendees number
     * @throws IllegalArgumentException if there are any invalid cases
     */

    public DinnerEvent(String name, int num) throws IllegalArgumentException {
        super(name, num);
        if (num < 10 || num > 50)
            throw new IllegalArgumentException("num of attendees is not valid");
        this.nonVegeNum = this.getNonVegetarian();
        this.vegeNum = this.getVegetarian();
    }

    /**
     * @return the number of non-vegetarian entrees
     */
    public int getNonVegetarian() {
        return (int) (Math.round(this.num * NONVEGE));
    }

    /**
     * @return the number of vegetarian entrees
     */
    public int getVegetarian() {
        return (int) (Math.round(this.num * VEGE));
    }

    /**
     * @return the nonVegeNum
     */

    public int getNonVegeNum() {
        return this.nonVegeNum;
    }

    /**
     * @return the VegeNum
     */

    public int getVegeNum() {
        return this.vegeNum;
    }
}
