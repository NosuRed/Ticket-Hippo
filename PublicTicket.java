import java.time.LocalDate;

public abstract class PublicTicket extends GenericTicket {
    /* Daily and guest tickets have a time limit of one day

    */
    private LocalDate setDay;


    /**
     * @param setDay the date of when the ticket is valid is set here
     * @param setBlock the block for ticket is set here
     * @param setSeat the set for the ticket is set here
     */
    public PublicTicket(LocalDate setDay, int setBlock, int setSeat) {
        this.setDay = setDay;
        this.seat = setSeat;
        this.block = setBlock;
        }

    @Override
    // checks if the Date on the ticket is valid for the date of the game
    public boolean isPlaceValidToday() {
        // for the sake of simplicity the date of a game is always the local time
        return (setDay.compareTo(LocalDate.now()) == 0);
    }

    public LocalDate getSetDay() {
        return setDay;
    }

    public void setSetDay(LocalDate setDay) {
        this.setDay = setDay;
    }



}
