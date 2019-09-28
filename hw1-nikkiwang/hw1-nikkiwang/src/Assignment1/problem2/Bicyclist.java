package problem2;

/**
 * Represents a Bicyclist with their details -- name, team, startTime and endTime
 * This class is used as a part of Problem 2.
 */
public class Bicyclist {
    private String name;
    private String team;
    private Time startTime;
    private Time endTime;

    /**
     * Creates a new bicyclist given the name and team as Strings,
     * startTime and endTime as Time.
     */
    public Bicyclist(String name, String team, Time startTime, Time endTime) {
        this.name = name;
        this.team = team;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * return the team
     */
    public String getTeam() {
        return this.team;
    }

    /**
     * return the start time
     */
    public Time getStartTime() {
        return this.startTime;
    }

    /**
     * return the end time
     */
    public Time getEndTime() {
        return this.endTime;
    }

    /**
     * set the new name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * set the new team name
     */
    public void setTeam(String newTeam) {
        this.team = newTeam;
    }

    /**
     * set the new start time
     */
    public void setStartTime(Time newStartTime) {
        this.startTime = newStartTime;
    }

    /**
     * set the new end time
     */
    public void setEndTime(Time newEndTime) {
        this.endTime = newEndTime;
    }

    /**
     * return the duration time
     */
    public Time getDuration() {
        int start = startTime.transSeconds();
        int end = endTime.transSeconds();
        int duration = end - start;
        int hour = duration / 3600;
        duration -= hour * 3600;
        int min = duration / 60;
        int sec = duration % 60;
        Time durationTime = new Time(hour, min, sec);
        return durationTime;
    }
}
