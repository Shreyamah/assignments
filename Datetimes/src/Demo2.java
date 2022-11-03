import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class Demo2 {
    public static void main(String[] args) {
        DayOfWeek dayofweek = LocalDate.parse("2022-11-02").getDayOfWeek();
       int DayOfMonth; int daymonth = LocalDate.parse("2022-11-10").getDayOfMonth();
        System.out.println(dayofweek);
        System.out.println(daymonth);
       LocalDate date= LocalDate.now();
        System.out.println(date.isLeapYear());

        // comparing dates
        Boolean ans = LocalDate.parse("2022-11-02").isBefore(LocalDate.parse("2022-11-04"));

        System.out.println(ans);

        //others
        LocalDateTime start= LocalDate.parse("2022-11-10").atStartOfDay();
        System.out.println(start);

    }
}
