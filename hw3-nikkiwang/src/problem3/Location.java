package problem3;

/**
 * Represents a class Location as with their details--city and country
 *
 * @author nikkiwang
 */
public class Location {

  private String city;
  private String country;

  /**
   * Construct a location object.
   *
   * @param city -- city
   * @param country -- country
   */
  public Location(String city, String country) {
    this.city = city;
    this.country = country;
  }

  /**
   * Get city.
   *
   * @return city
   */
  public String getCity() {
    return this.city;
  }

  /**
   * Set city.
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Get country.
   *
   * @return country
   */
  public String getCountry() {
    return this.country;
  }

  /**
   * Set country.
   */
  public void setCountry(String country) {
    this.country = country;
  }
}
