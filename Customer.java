import java.time.LocalDate;


public class Customer {
    String firstName, lastName;
    LocalDate birthDate;

    /**
     * This constructor creates the costumer
     *
     * @param FirstName sets the first name
     * @param LastName sets the last name
     * @param BirthDate sets the birth day
    */
    // Parameter are given to the constructor to create a customer
    public  Customer(String FirstName, String LastName, LocalDate BirthDate){
        firstName = FirstName;
        lastName = LastName;
        birthDate = BirthDate;}

    // creating a ticket. It always is a Generic Ticket
    private  GenericTicket ticket;

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
