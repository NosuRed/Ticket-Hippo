import java.time.LocalDate;

public class Member extends Customer {
    private int memberID;

    /**
     * the Member extends from customer and is used to set the members information
     * everything except the MemberID is called from the super
     * used to set a member ID
     * @param FirstName set the first name
     * @param LastName set zhe last name
     * @param BirthDate set the birth date
     * @param MemberID sets the member id
     *
     */
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
