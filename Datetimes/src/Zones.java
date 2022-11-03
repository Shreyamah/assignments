import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zones {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Europe/Paris");
        ZonedDateTime zdt= ZonedDateTime.of(LocalDateTime.now(),id);
        System.out.println(zdt);
    }
}
