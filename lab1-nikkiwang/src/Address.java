/*
Represents an Address with their details -- streetNumber, streetName, cityName, stateAcronym,
zipCode and countyName
 */
public class Address {
    private Integer streetNumber;
    private String streetName;
    private String cityName;
    private String stateAcronym;
    private Integer zipCode;
    private String countyName;

    /*
    Creates a new address given the streetName, cityName, stateAcronym and countyName as Strings,
    zipCode and streetNumber as Integers.
     */
    public Address(Integer streetNumber, String streetName, String cityName,
                   String stateAcronym, Integer zipCode, String countyName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAcronym = stateAcronym;
        this.zipCode = zipCode;
        this.countyName = countyName;
    }

    /*
    return the streetName
     */
    public Integer getStreetNumber() {
        return this.streetNumber;
    }

    /*
    return the streetName
     */
    public String getStreetName() {
        return this.streetName;
    }

    /*
    return the cityName
     */
    public String getCityName() {
        return this.cityName;
    }

    /*
    return the stateAcronym
     */
    public String getStateAcronym() {
        return this.stateAcronym;
    }

    /*
    return the zipCode
     */
    public Integer getZipCode() {
        return this.zipCode;
    }

    /*
    return the countryName
     */
    public String getCountyName() {
        return this.countyName;
    }

    /*
    set the new streetNumber
     */
    public void setStreetNumber(Integer newStreetNumber) {
        this.streetNumber = newStreetNumber;
    }

    /*
    set the new streetName
     */
    public void setStreetName(String newStreetName) {
        this.streetName = newStreetName;
    }

    /*
    set the new cityName
     */
    public void setCityName(String newCityName) {
        this.cityName = newCityName;
    }

    /*
    set the new StateAcronym
     */
    public void setStateAcronym(String newStateAcronym) {
        this.stateAcronym = newStateAcronym;
    }

    /*
    set the new zipCode
     */
    public void setZipCode(Integer newZipcode) {
        this.zipCode = newZipcode;
    }

    /*
    set the new countryName
     */
    public void setCountyName(String newCountryName) {
        this.countyName = newCountryName;
    }
}
