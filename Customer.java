import java.time.LocalDate;


public class Customer {
    public String firstName, lastName;
    public LocalDate birthDate;
    // creating a ticket. It always is a Generic Ticket
    private  GenericTicket ticket;

    /**
     * This constructor creates the costumer
     *
     * @param firstName sets the first name
     * @param LastName sets the last name
     * @param birthDate sets the birth day
    */
    // Parameter are given to the constructor to create a customer
    public  Customer(String firstName, String LastName, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = LastName;
        this.birthDate = birthDate;
    }


    // returns the birth date of the customer
    public LocalDate getBirthDate() {
        return birthDate;
    }


    // Sets the parameters for the ticket. Every ticket is a generic ticket
    public void setTicket(GenericTicket ticket) {
        this.ticket = ticket;
    }


    // is false on default, is called in the Member class
    public boolean isMember(){
        return false;
    }


    // Returns the ticket
    public GenericTicket getTicket() {
        return ticket;
    }

}
