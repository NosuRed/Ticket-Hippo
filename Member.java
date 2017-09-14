import java.time.LocalDate;

public class Member extends Customer {
    private int memberID;

    // constructor for the creation of a Member that is used for the season ticket
    Member(String FirstName, String LastName, LocalDate BirthDate, int MemberID) {
        // takes the Information from the Super class Customer
        super(FirstName, LastName, BirthDate);
        this.memberID = MemberID;
    }


    public int getMemberID() {
        return memberID;
    }

    @Override
    // Overrides the isMember method. This enables the member status
    public boolean isMember(){
        return true;
    }
}
