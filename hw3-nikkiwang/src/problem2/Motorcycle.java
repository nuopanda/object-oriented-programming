package problem2;

/**
 * Represents a class Motorcycle as with their details--color, makeAndModel, license, velocity,
 * direction, MINIMUM, MAXIMUM
 *
 * @author nikkiwang
 */
public class Motorcycle extends AbstractVehicle {

  private String color;
  private MakeAndModel makeAndModel;
  private String license;
  private double velocity;
  private Direction direction;
  private final int MAXIMUM = 65;
  private final int MINIMUM = 40;

  /**
   * @param color -- motorcycle's color
   * @param makeAndModel -- motorcycle's make and model
   * @param license -- motorcycle's license
   * @param velocity -- motorcycle's velocity
   * @param direction -- motorcycle's direction
   */
  public Motorcycle(String color, MakeAndModel makeAndModel, String license, double velocity,
      Direction direction) throws IllegalArgumentException {
    super(color, makeAndModel, license, velocity, direction);
    if (velocity < 0 || velocity > MAXIMUM) {
      throw new IllegalArgumentException("invalid velocity");
    }
  }

  /**
   * Acceralte the velocity.
   *
   * @param acceFactor -- acceleration factor
   */
  @Override
  public void acceleration(int acceFactor) throws Exception {
    if (acceFactor < 10 || acceFactor > 50) {
      throw new IllegalArgumentException("invalid acceleration factor");
    }
    if ((100 + acceFactor) * this.getVelocity() / 100 > MAXIMUM) {
      throw new InvalidAccelerationException("exceed the maximum velocity");
    }
    this.setVelocity((double) (100 + acceFactor) * this.getVelocity() / 100);
  }

}
