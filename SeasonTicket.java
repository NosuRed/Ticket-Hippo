import java.time.LocalDate;


public class SeasonTicket extends GenericTicket {
    private LocalDate startOfSeason;
    private LocalDate endOfSeason;


    // Constructor for the season ticket. takes the parameters for construction of the season
    public SeasonTicket(LocalDate startOfSeason, LocalDate endOfSeason, int block, int seat) {

        // a season ticket has a duration, so two dates are needed.
        setStartOfSeason(startOfSeason);
        setEndOfSeason(endOfSeason);
        // We call the setters for block and seat to declare these for the ticket
        setBlock(block);
        setSeat(seat);

    }


    public LocalDate getStartOfSeason() {
        return startOfSeason;
    }

    // sets the beginning of the season when creating a season ticket
    public void setStartOfSeason(LocalDate startOfSeason) {
        this.startOfSeason = startOfSeason;
    }


    public LocalDate getEndOfSeason() {
        return endOfSeason;
    }
    // sets the end of the season when creating a season ticket
    public void setEndOfSeason(LocalDate endOfSeason) {
        this.endOfSeason = endOfSeason;
    }


    @Override
    public boolean isPlaceValid() {
        // if the block is available for this ticket it will return True
        return true;
    }

    @Override
    public boolean isPlaceValidToday() {
        // checks if the ticket is already valid or expired. Returns a boolean
        return(startOfSeason.compareTo(LocalDate.now()) < 0 && endOfSeason.compareTo(LocalDate.now()) > 0 );

    }
}

