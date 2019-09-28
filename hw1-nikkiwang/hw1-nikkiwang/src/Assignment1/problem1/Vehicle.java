/**
 * Class Vehicle, containing information about a vehicle. This class
 * is used as a part of Problem 1.
 */
package problem1;

import problem1.Owner;

/**
 * Vehicle is a simple object that has a unique Vehicle
 * Identification Number (VIN), and corresponding license plate.
 */

public class Vehicle {
    // the length of VIN is 17. should be represented by String, but not Integer
    private String VIN;
    private String licensePlate;
    private String firstName;
    private String lastName;
    private String phone;

    /**
     * Constructor that creates a new vehicle object with the
     * specified VIN and license plate.
     *
     * @param VIN          - VIN of the new Vehicle object.
     * @param licensePlate - license plate of the new Vehicle.
     * @param firstName    - first Name of the owner.
     * @param lastName     - last Name of the owner.
     * @param phone        - phone number of the owner.
     */
    public Vehicle(String VIN, String licensePlate, Owner owner) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.firstName = owner.getFirstName();
        this.lastName = owner.getLastName();
        this.phone = owner.getPhone();
    }

    /**
     * Returns the VIN of the Vehicle.
     *
     * @return the VIN of the Vehicle.
     */
    public String getVIN() {
        return this.VIN;
    }

    /**
     * Returns the licensePlate of the Vehicle.
     *
     * @return the licensePlate of the Vehicle.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Returns the first Name of the Vehicle's owner.
     *
     * @return the firstName of the Vehicle's owner.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the last Name of the Vehicle's owner.
     *
     * @return the lastName of the Vehicle's owner.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns the phone number of the Vehicle's owner.
     *
     * @return the phone of the Vehicle's owner.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the VIN of the Vehicle.
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * Sets the licensePlate of the Vehicle.
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;

    }

    /**
     * Sets the firstName of Vehicle's owner.
     */
    public void setFirstName(Owner newOwner) {
        this.firstName = newOwner.getFirstName();
    }

    /**
     * Sets the lastName of Vehicle's owner.
     */
    public void setLastName(Owner newOwner) {
        this.lastName = newOwner.getLastName();
    }

    /**
     * Sets the phone number of Vehicle's owner.
     */
    public void setPhone(Owner newOwner) {
        this.phone = newOwner.getPhone();
    }
}