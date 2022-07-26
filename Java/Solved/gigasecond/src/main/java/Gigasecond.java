import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class Gigasecond {
    // we need to store the received date
    private LocalDateTime date;

    // the class can be initialized with a LocalDate or LocalDateTime object
    public Gigasecond(LocalDate moment) {
        this.date = moment.atTime(0, 0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.date = moment;
    }

    // returns the date received in the constructor + 1 billion seconds
    public LocalDateTime getDateTime() {
        return this.date.plusSeconds(1000000000L);
    }
}
