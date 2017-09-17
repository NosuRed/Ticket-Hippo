import java.time.LocalDate;


public class SeasonTicket extends GenericTicket {
    private LocalDate startOfSeason;
    private LocalDate endOfSeason;


    // Constructor for the season ticket. takes the parameters for construction of the season

    /**
     * the constructor creates a SeasonTicket
     * the start and the end of a season are given, within this time period the ticket is valid
     * @param startOfSeason is the start of the season
     * @param endOfSeason is the end of the season
     * @param block is the block for the ticket
     * @param seat  is the seat for the ticket
     */
    public SeasonTicket(LocalDate startOfSeason, LocalDate endOfSeason, int block, int seat) {
        setStartOfSeason(startOfSeason);
        setEndOfSeason(endOfSeason);
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
        return true;
    }

    @Override
    public boolean isPlaceValidToday() {
        // the seasons duration is set when creating a season ticket
        // checks if the ticket is already valid or expired. Returns a boolean
        return(startOfSeason.compareTo(LocalDate.now()) <=0 && endOfSeason.compareTo(LocalDate.now()) >=0 );
    }
}

