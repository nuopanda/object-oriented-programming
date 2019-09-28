package problem1;

/**
 * Represents an DailyEvents with their details--date, lunch and dinner
 *
 * @author nikkiwang
 */
public class DailyEvents {
    private int date;
    private boolean lunch;
    private boolean dinner;

    /**
     * Creates a new DailyEvents, given the date as int.
     *
     * @param date the DailyEvent's date
     */

    public DailyEvents(int date) {
        this.date = date;
        this.lunch = false;
        this.dinner = false;
    }

    /**
     * @param type -- Event type: lunch or dinner
     * @param name -- client name
     * @param num  -- number of attendees
     * @return new Event (LunchEvent or DinnerEvent)
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public Event createEvent(String type, String name, int num) throws IllegalArgumentException {
        Event newEvent = null;
        if (type.equals("lunch")) {
            if (!this.lunch) {
                newEvent = new LunchEvent(name, num);
                this.lunch = true;
            } else throw new IllegalArgumentException("lunch time slot has been booked.");
        } else if (type.equals("dinner")) {
            if (!this.dinner) {
                newEvent = new DinnerEvent(name, num);
                this.dinner = true;
            } else throw new IllegalArgumentException("dinner time slot has been booked");
        }
        return newEvent;
    }
}
