import java.time.LocalDate;

public abstract class PublicTicket extends GenericTicket {
    private LocalDate setDay;
    // constructor that set creates a public ticket


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
