
import java.time.LocalDate;
import java.util.Scanner;
public class Entry {


    // Checks if the Customer has a valid ticket for the date of the game
    // is the "entrance" of the stadium
    public boolean checkName(Customer customer){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a first name:");
        String firstName = scanner.nextLine();
        System.out.println("Insert your last name:");
        String lastName = scanner.nextLine();


        if (customer.firstName.equals(firstName) && customer.lastName.equals(lastName)){
            return true;
        }else{
            return false;
        }

    }

    public boolean checkTicket(Customer customer){
        return customer.getTicket().isPlaceValidToday();
    }
}
