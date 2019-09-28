package problem1;

import java.util.List;
/**
 * Represents a class Actor as with their details--name, age, activeYears, genre, awards, movies, series, multimedia
 *
 * @author nikkiwang
 */
public class Actor extends AbstractADF {
    private Name name;
    private int age;
    private String activeYears;
    private Genre genre;
    private List<String> awards;
    private List<String> movies;
    private List<String> series;
    private List<String> multimedia;
    /**
     * Create a actor object.
     *
     * @param name        -- Actor's name
     * @param age         -- Actor's age
     * @param activeYears -- Actor's active years
     * @param genre       -- Actor's genre
     * @param awards      -- Actor's list of awards
     * @param movies      -- Actor's list of movies
     * @param series      -- Actor's list of series
     * @param multimedia  --Actor's list of multimedia
     * @throws IllegalArgumentException if there are any invalid cases
     */
    public Actor(Name name, int age, String activeYears, Genre genre, List<String> awards, List<String> movies, List<String> series, List<String> multimedia) throws IllegalArgumentException {
        super(name, age, activeYears, genre, awards, movies, series, multimedia);
    }
}
