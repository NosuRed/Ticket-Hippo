import java.time.LocalDate;

public class GuestTicket extends PublicTicket {
    // guest tickets are always block 99
    // easy to change here, just change the setBlock to a different one!
    private static final int BLOCK = 99;

    /**
     * creates a guest ticket
     * the block for a guest ticket is always 99
     * the constructor is adjusted so that no block can be given
     * @param setDay sets the day the ticket is valid
     * @param setSeat sets the seat for the guest ticket
     *
    */
    public GuestTicket(LocalDate setDay, int setSeat) {
        super(setDay, setSeat, BLOCK);
    }

    //@Override
    public boolean isPlaceValid() {
        return true;
    }
}
