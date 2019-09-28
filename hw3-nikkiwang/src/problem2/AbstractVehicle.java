package problem2;

/**
 * Represents an Abstract class AbstractVehicle as with their details--color, makeAndModel, license,
 * velocity, direction, MINIMUM.
 *
 * @author nikkiwang
 */
public abstract class AbstractVehicle {

  private String color;
  private MakeAndModel makeAndModel;
  private String license;
  private double velocity;
  private Direction direction;
  private final int MINIMUM = 40;

  /**
   * Construct an abstract class AbstractVehicle
   *
   * @param color -- vehicle's color
   * @param makeAndModel -- vehicle's make and model
   * @param license -- vehicle's license
   * @param velocity -- vehicle's velocity
   * @param direction -- vehicle's direction
   * @throws IllegalArgumentException if there are any invalid cases
   */
  public AbstractVehicle(String color, MakeAndModel makeAndModel, String license, double velocity,
      Direction direction) throws IllegalArgumentException {
    if (velocity < MINIMUM) {
      throw new IllegalArgumentException("invalid velocity");
    }
    this.color = color;
    this.makeAndModel = makeAndModel;
    this.license = license;
    this.velocity = velocity;
    this.direction = direction;
  }

  /**
   * Get color.
   *
   * @return color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Set color.
   */
  public void setColor(String newColor) {
    this.color = newColor;
  }

  /**
   * Get make and model.
   *
   * @return makeAndModel
   */
  public MakeAndModel getMakeAndModel() {
    return this.makeAndModel;
  }

  /**
   * Set make and model.
   */
  public void setMakeAndModel(MakeAndModel newMakeAndModel) {
    this.makeAndModel = newMakeAndModel;
  }

  /**
   * Get licence.
   *
   * @return license
   */
  public String getLicense() {
    return this.license;
  }

  /**
   * Set licence.
   */
  public void setLicense(String newLicense) {
    this.license = newLicense;
  }

  /**
   * Get velocity.
   *
   * @return velocity
   */
  public double getVelocity() {
    return this.velocity;
  }

  /**
   * Set velocity.
   */
  public void setVelocity(double newVelocity) {
    this.velocity = newVelocity;
  }

  /**
   * Get direction.
   *
   * @return direction
   */
  public Direction getDirection() {
    return this.direction;
  }

  /**
   * Set direction.
   */
  public void setDirection(Direction newDirection) {
    this.direction = newDirection;
  }


  /**
   * to be override.
   *
   * @param acceFactor -- acceleration factor
   */
  public void acceleration(int acceFactor) throws Exception {

  }

  /**
   * Implement deceleration.
   *
   * @param deceFactor -- deceleraton factor
   */
  public void deceleration(int deceFactor) throws Exception {
    if (deceFactor < 20 || deceFactor > 50) {
      throw new IllegalArgumentException("invalid deceleration factor");
    }
    if ((100 - deceFactor) * this.velocity / 100 < MINIMUM) {
      throw new InvalidDecelerationException("not meet the minimum allowed velocity");
    }
    this.velocity = (100 - deceFactor) * this.velocity / 100;

  }


  /**
   * Change direction.
   */
  public void changeDirection(Direction newDirection) throws IllegalArgumentException {
    if (this.direction == Direction.Northbound && newDirection == Direction.Southbound) {
      this.setDirection(Direction.Southbound);
    } else if (this.direction == Direction.Southbound && newDirection == Direction.Northbound) {
      this.setDirection(Direction.Northbound);
    } else if (this.direction == Direction.Eastbound && newDirection == Direction.Westbound) {
      this.setDirection(Direction.Westbound);
    } else if (this.direction == Direction.Westbound && newDirection == Direction.Eastbound) {
      this.setDirection(Direction.Eastbound);
    } else {
      throw new IllegalArgumentException("invalid change");
    }
  }

}

