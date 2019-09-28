package problem1;

/**
 * Represents an Events with their details--name, num
 *
 * @author nikkiwang
 */
public class Event {
    public String clientName;
    public int num;

    /**
     * Creates a new Events , given the name as String and num as int.
     *
     * @param name -- client name
     * @param num  -- attendees number
     */
    public Event(String name, int num) {
        this.clientName = name;
        this.num = num;
    }

    /**
     * @return client's name
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return num
     */
    public int getNum() {
        return this.num;
    }

}
