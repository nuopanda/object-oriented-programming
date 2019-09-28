package problem2;

/**
 * Represents a class MakeAndModel as with their details--make and model
 *
 * @author nikkiwang
 */
public class MakeAndModel {

  private String make;
  private String model;

  /**
   * @param make -- vehicle's make
   * @param model -- vehicle's model
   */
  public MakeAndModel(String make, String model) {
    this.make = make;
    this.model = model;
  }

  /**
   * @return make
   */
  public String getMake() {
    return this.make;
  }

  /**
   *
   */
  public void setMake(String newMake) {
    this.make = newMake;
  }

  /**
   * @return model
   */
  public String getModel() {
    return this.model;
  }

  /**
   *
   */
  public void setModel(String newModel) {
    this.model = newModel;
  }
}
