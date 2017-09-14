import java.time.LocalDate;


public class Customer {
    String firstName, lastName;
    LocalDate birthDate;
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


    // Sets the parameters for the ticket
    public void setTicket(GenericTicket ticket) {
        this.ticket = ticket;
    }





    public boolean isMember(){
        return false;
    }


    // Returns the ticket
    public GenericTicket getTicket() {
        return ticket;
    }

}
