package problem3;

/**
 * Represents a Menu with their details--meals, desserts, beverages and drinks
 *
 * @author nikkiwang
 */
public class Menu {
    private String meals;
    private String desserts;
    private String beverages;
    private String drinks;

    /**
     * Creates a new Menu, given the meals, desserts, beverages and drinks as strings
     *
     * @param meals     the menu's meals
     * @param desserts  the menu's desserts
     * @param beverages the menu's beverages
     * @param drinks    the menu's drinks
     */
    public Menu(String meals, String desserts, String beverages, String drinks) {
        this.meals = meals;
        this.desserts = desserts;
        this.beverages = beverages;
        this.drinks = drinks;
    }

    /**
     * @return meals
     */
    public String getMeals() {
        return this.meals;
    }

    /**
     * @return desserts
     */
    public String getDesserts() {
        return this.desserts;
    }

    /**
     * @return beverages
     */
    public String getBeverages() {
        return this.beverages;
    }

    /**
     * @return drinks
     */
    public String getDrinks() {
        return this.drinks;
    }

    /**
     * @param newMeals new meals
     */
    public void setMeals(String newMeals) {
        this.meals = newMeals;
    }

    /**
     * @param newDesserts new desserts
     */
    public void setDesserts(String newDesserts) {
        this.desserts = newDesserts;
    }

    /**
     * @param newBeverages new beverages
     */
    public void setBeverages(String newBeverages) {
        this.beverages = newBeverages;
    }

    /**
     * @param newDrinks new drinks
     */
    public void setDrinks(String newDrinks) {
        this.drinks = newDrinks;
    }
}

