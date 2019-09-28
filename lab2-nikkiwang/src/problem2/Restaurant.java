package problem2;

/**
 * Represents a Restaurant with their details--name, physical address and open/closed
 *
 * @author nikkiwang
 */
public class Restaurant {
    private String name;
    private String address;
    private boolean isOpen;

    /**
     * Creates a new Restaurant, given the name, address as strings and open/closed as boolean.
     *
     * @param name    the restaurant's name
     * @param address the restaurant's address
     * @param isOpen  whether the restaurant is open
     */
    public Restaurant(String name, String address, boolean isOpen) {
        this.name = name;
        this.address = address;
        this.isOpen = isOpen;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return whether the restaurant is open
     */
    public boolean getIsOpen() {
        return this.isOpen;
    }

    /**
     * @param newName the restaurant's new name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * @param newAddress the restaurant's new addresss
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    /**
     * @param newOpen the restaurant's new status
     */
    public void setOpen(boolean newOpen) {
        this.isOpen = newOpen;
    }

}
