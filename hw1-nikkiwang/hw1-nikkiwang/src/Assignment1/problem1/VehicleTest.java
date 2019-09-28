package problem1;
import problem1.Owner;
import problem1.Vehicle;

import static org.junit.Assert.*;

/**
 * test the Vehicle class
 */
public class VehicleTest {
    private Vehicle vehicle;

    /**
     * creates a new object of Vehicle class
     */
    @org.junit.Before
    public void setUp() throws Exception {
        Owner owner = new Owner("John", "Green", "3738421422");
        vehicle = new Vehicle("JH4TB2H26CC000000", "BBN3801", owner);
    }

    /**
     * test getVin method
     */
    @org.junit.Test
    public void getVIN() {
        assertEquals("JH4TB2H26CC000000", vehicle.getVIN());
    }

    /**
     * test getLicensePlate method
     */
    @org.junit.Test
    public void getLicensePlate() {
        assertEquals("BBN3801",vehicle.getLicensePlate());
    }

    /**
     * test getFirstName method
     */
    @org.junit.Test
    public void getFirstName() {
        assertEquals("John",vehicle.getFirstName());
    }

    /**
     * test getLastName method
     */
    @org.junit.Test
    public void getLastName() {
        assertEquals("Green",vehicle.getLastName());
    }

    /**
     * test getPhone method
     */
    @org.junit.Test
    public void getPhone() {
        assertEquals("3738421422", vehicle.getPhone());
    }


    /**
     * test setVin method
     */
    @org.junit.Test
    public void setVIN() {
        vehicle.setVIN("JA4TB2H26CC555555");
        assertEquals("JA4TB2H26CC555555", vehicle.getVIN());
    }

    /**
     * test setLicensePlate method
     */
    @org.junit.Test
    public void setLicensePlate() {
        vehicle.setLicensePlate("AKT3291");
        assertEquals("AKT3291",vehicle.getLicensePlate());
    }

    /**
     * test setFirstName method
     */
    @org.junit.Test
    public void setFirstName() {
        Owner owner2 = new Owner("Alice", "Bush", "2127893710");
        vehicle.setFirstName(owner2);
        assertEquals("Alice",vehicle.getFirstName());
    }

    /**
     * test setLastName method
     */
    @org.junit.Test
    public void setLastName() {
        Owner owner2 = new Owner("Alice", "Bush", "2127893710");
        vehicle.setLastName(owner2);
        assertEquals("Bush", vehicle.getLastName());
    }

    /**
     * test setPhone method
     */
    @org.junit.Test
    public void setPhone() {
        Owner owner2 = new Owner("Alice", "Bush", "2127893710");
        vehicle.setPhone(owner2);
        assertEquals("2127893710", vehicle.getPhone());
    }
}