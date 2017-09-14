import java.time.LocalDate;

public class DayTicket extends PublicTicket {

    public DayTicket(LocalDate setDay, int setBlock, int setSeat) {
        super(setDay, setBlock, setSeat);
    }

    @Override
    public boolean isPlaceValid() {
        return true;
    }
}
