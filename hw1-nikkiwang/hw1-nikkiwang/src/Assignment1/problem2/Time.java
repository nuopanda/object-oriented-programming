package problem2;

/**
 * Class Time, containing information about time. This class
 * is used as a part of Problem 2.
 */
public class Time {
    private int hour;
    private int min;
    private int sec;

    /**
     * Creates a new time given the hour, min and sec as int
     *
     * @param hour -- hour of the new Time object, check if hour is in the correct range
     * @param min  -- min of the new Time object, check if min is in the correct range
     * @param sec  -- sec of the new Time object, check if sec is in the correct range
     */
    public Time(int hour, int min, int sec) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("hour " + hour + " is not valid");
        if (min < 0 || min > 59) throw new IllegalArgumentException("min " + min + " is not valid");
        if (sec < 0 || sec > 59) throw new IllegalArgumentException("sec " + sec + " is not valid");
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    /**
     * @return the hour of the Time
     */
    public int getHour() {
        return this.hour;
    }

    /**
     * @return the min of the Time
     */
    public int getMin() {
        return this.min;
    }


    /**
     * @return the sec of the Time
     */
    public int getSec() {
        return this.sec;
    }

    /**
     * Transfer hour, min, sec to sec
     *
     * @return the whole time represented in sec
     */
    public int transSeconds() {
        int transSec = this.hour * 3600 + this.min * 60 + this.sec;
        return transSec;
    }

    /**
     * sets the hour of the Time
     */
    public void setHour(int newHour) {
        this.hour = newHour;
    }

    /**
     * sets the min of the Time
     */
    public void setMin(int newMin) {
        this.min = newMin;
    }

    /**
     * sets the sec of the Time
     */
    public void setSec(int newSec) {
        this.sec = newSec;
    }
}
