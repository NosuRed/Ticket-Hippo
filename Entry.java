
import java.time.LocalDate;
import java.util.Scanner;
public class Entry {
    // Checks if the Customer has a valid ticket for the date of the game
    // is the "entrance" of the stadium
    /**
     * this method compares the customers first- and last name with an input
     * tis input should be names also
     * @param customer is the first and the last name
     * @return if the first and last name equals the inputs, true will be returned, else false is returned
     */
    public boolean checkName(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customers first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the customers last name:");
        String lastName = scanner.nextLine();
        if (customer.firstName.equals(firstName) && customer.lastName.equals(lastName)){
            return true;
        }else{
            return false;
        }

    }

    /**
     * this method checks if the ticket has a valid date for the game
     * @param customer gets the customers date information
     * @return a boolean, if the date or time duration( season ticket) is valid it will return true, else it will be false
     */
    public boolean checkTicket(Customer customer){
        return customer.getTicket().isPlaceValidToday();
    }
}
