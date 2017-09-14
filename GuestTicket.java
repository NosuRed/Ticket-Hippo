import java.time.LocalDate;

public class GuestTicket extends PublicTicket {
    // constructor creates a guest ticket
    // guest tickets are always block 99
    // easy to change here, just change the setBlock to a different one!
    private static final int BLOCK = 99;

    public GuestTicket(LocalDate setDay, int setSeat) {
        super(setDay, setSeat, BLOCK);
    }

    @Override
    // guest tickets are always the set block, so it will always return true
    public boolean isPlaceValid() {
        return true;
    }
}
