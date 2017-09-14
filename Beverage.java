public class Beverage {
    private String name;
    private double price;
    private int minimumAgeRequirement;

    // returns the name of a beverage
    public String getName() {
        return name;
    }


    // returns the price of a beverage
    public double getPrice() {
        return price;
    }

    // returns the declared minimum age requirement
    public int isMinimumAgeRequirement() {
        return minimumAgeRequirement;
    }


    // constructs a beverage with the name, the price and the Age requirement
    public Beverage(String name, double price, int minimumAgeRequirement) {
        this.name = name;
        this.price = price;
        this.minimumAgeRequirement = minimumAgeRequirement;

    }
}
