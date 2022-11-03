import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Timedemo {
    public static void main(String[] args) {
         LocalTime demo=  LocalTime.now();
         System.out.println(demo);
        LocalTime demo1=  LocalTime.parse("09:13");
        System.out.println(demo1);
        LocalTime demo3=  LocalTime.of(10,30);
        System.out.println(demo3);
       LocalTime plus= demo3.plus(5,ChronoUnit.HOURS);
        System.out.println(plus);
        Boolean ans = LocalTime.parse("11:30").isBefore(LocalTime.parse("12:30"));

        System.out.println(ans);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);



    }
}