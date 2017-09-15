import java.time.LocalDate;

public class DayTicket extends PublicTicket {

    /**
     * creates a daily ticket
     * uses the information of the super class to create a ticket
     * @param setDay the date of when the ticket is valid is set here
     * @param setBlock the block for ticket is set here
     * @param setSeat the set for the ticket is set here
     */
    public DayTicket(LocalDate setDay, int setBlock, int setSeat) {
        super(setDay, setBlock, setSeat);
    }

    @Override
    public boolean isPlaceValid() {
        return true;
    }
}
