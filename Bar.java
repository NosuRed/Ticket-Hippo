import java.time.LocalDate;
import java.util.Hashtable;
import java.time.temporal.ChronoUnit;

public class Bar {

    Hashtable<String, Beverage> availableBeverages = new Hashtable<>();

    // add the beverages to the Hashtable
    public void addBeverage(Beverage beverage) {
        availableBeverages.put(beverage.getName(), beverage);
    }

    public void order(String beverage, Customer customer) {
        Beverage drink = availableBeverages.get(beverage);
        // message if the beverage is not available
        if (drink == null) {
            System.out.println("The wanted beverage is not available");
        // message in case the customer is not old enough to buy a beverage
        } else if (!checkAge(customer.getBirthDate(), drink)) {
            System.out.println("You are too young to buy this beverage " + customer.firstName);
        // message if the customer successfully buys a beverage
        } else if (customer.getTicket().modAccountBalance(-drink.getPrice())) {
            System.out.println(String.format(java.util.Locale.getDefault(), "%s %s %s %s %.2f %s", "Enjoy your", beverage, customer.firstName, "your new balance is", customer.getTicket().getAccountBalance(), " Euro"));
        // message in case the customer does not have enough money to buy the beverage of choice
        } else {
            System.out.println(customer.firstName + " you don't have enough money to purchase this beverage. Your balance is " + customer.getTicket().getAccountBalance() + " Euro" + " and your beverage costs " + drink.getPrice() + " Euro");
        }
    }

    // returns a boolean
    private boolean checkAge(LocalDate birthDate, Beverage beverage) {
        // calculates the age between the birth date and the local date.
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now()) >= beverage.isMinimumAgeRequirement();
    }
}