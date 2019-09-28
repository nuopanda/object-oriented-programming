package problem2;

/**
 * Represents a class Truck as with their details--color, makeAndModel, license, velocity,
 * direction, MINIMUM, MAXIMUM
 *
 * @author nikkiwang
 */
public class Truck extends AbstractVehicle {

  private String color;
  private MakeAndModel makeAndModel;
  private String license;
  private double velocity;
  private Direction direction;
  private final int MAXIMUM = 60;
  private final int MINIMUM = 40;

  /**
   * @param color -- truck's color
   * @param makeAndModel -- truck's make and model
   * @param license -- truck's license
   * @param velocity -- truck's velocity
   * @param direction -- truck's direction
   */
  public Truck(String color, MakeAndModel makeAndModel, String license, double velocity,
      Direction direction) throws IllegalArgumentException {
    super(color, makeAndModel, license, velocity, direction);
    if (velocity < 0 || velocity > MAXIMUM) {
      throw new IllegalArgumentException("invalid velocity");
    }
  }

  /**
   * Accerlate the velocity.
   *
   * @param acceFactor -- acceleration factor
   */
  @Override
  public void acceleration(int acceFactor) throws Exception {
    if (acceFactor < 10 || acceFactor > 50) {
      throw new IllegalArgumentException("invalid acceleration factor");
    }
    if (((100 + acceFactor) * this.getVelocity() / 100) > MAXIMUM) {
      throw new InvalidAccelerationException("exceed the maximum velocity");
    }
    this.setVelocity((double) (100 + acceFactor) * this.getVelocity() / 100);
  }
}


