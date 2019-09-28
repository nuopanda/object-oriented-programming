import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    private Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address(12, "Ellsworth Ave", "Pittsburgh",
                "PA", 15213, "USA");
    }

    @Test
    public void getStreetNumber() {
        assertTrue(address.getStreetNumber() == 12);
    }

    @Test
    public void getStreetName() {
        assertEquals(address.getStreetName(), "Ellsworth Ave");

    }

    @Test
    public void getCityName() {
        assertEquals(address.getCityName(), "Pittsburgh");
    }

    @Test
    public void getStateAcronym() {
        assertEquals(address.getStateAcronym(), "PA");
    }

    @Test
    public void getZipCode() {
        assertTrue(address.getZipCode() == 15213);
    }

    @Test
    public void getCountyName() {
        assertEquals(address.getCountyName(), "USA");
    }

    @Test
    public void setStreetNumber() {
        address.setStreetNumber(76);
        assertTrue(address.getStreetNumber() == 76);
    }

    @Test
    public void setStreetName() {
        address.setStreetName(" Newport Way ");
        assertEquals(address.getStreetName(), " Newport Way ");
    }

    @Test
    public void setCityName() {
        address.setCityName("New York ");
        assertEquals(address.getCityName(), "New York ");
    }

    @Test
    public void setStateAcronym() {
        address.setStateAcronym("NY");
        assertEquals(address.getStateAcronym(), "NY");
    }

    @Test
    public void setZipCode() {
        address.setZipCode(76003);
        assertTrue(address.getZipCode() == 76003);
    }

    @Test
    public void setCountyName() {
        address.setCountyName(" U.S ");
        assertEquals(address.getCountyName(), " U.S ");
    }
}