import java.time.LocalDate;

public class Member extends Customer {
    private int memberID;

    public int getMemberID() {
        return memberID;
    }


    // constructor for the creation of a Member that is used for the season ticket
    Member(String FirstName, String LastName, LocalDate BirthDate) {
        // takes the Information from the Super class Customer
        super(FirstName, LastName, BirthDate);

        // declares the member ID with hashcode of the object
        // this way each member ID will be unique
        memberID = this.hashCode();
    }
    @Override
    // Overrides the isMember method. This enables the member status
    public boolean isMember(){
        return true;
    }
}
