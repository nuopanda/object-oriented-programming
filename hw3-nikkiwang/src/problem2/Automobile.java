package problem2;

/**
 * Represents a class Automobile as with their details--color, makeAndModel, license, velocity, direction, MINIMUM, MAXIMUM
 *
 * @author nikkiwang
 */
public class Automobile extends AbstractVehicle {
    private String color;
    private MakeAndModel makeAndModel;
    private String license;
    private double velocity;
    private Direction direction;
    private final int MAXIMUM = 70;
    private final int MINIMUM = 40;

    /**
     * @param color        -- automobile's color
     * @param makeAndModel -- automobile's make and model
     * @param license      -- automobile's license
     * @param velocity     -- automobile's velocity
     * @param direction    -- automobile's direction
     * @throws IllegalArgumentException
     */
    public Automobile(String color, MakeAndModel makeAndModel, String license, double velocity, Direction direction) {
        super(color, makeAndModel, license, velocity, direction);
        if (velocity < 0 || velocity > MAXIMUM) throw new IllegalArgumentException("invalid velocity");
    }

    /** Acceralte the velocity.
     * @param acceFactor -- acceleration factor
     * @throws Exception
     */
    @Override
    public void acceleration(int acceFactor) throws Exception {
        if (acceFactor < 10 || acceFactor > 50) throw new IllegalArgumentException("invalid acceleration factor");
        if (((100 + acceFactor) * this.getVelocity() / 100) > MAXIMUM)
            throw new InvalidAccelerationException("exceed the maximum velocity");
        this.setVelocity((double) (100 + acceFactor) * this.getVelocity() / 100);
    }

}
