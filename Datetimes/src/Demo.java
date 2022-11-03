
import java.time.LocalDate;
import java.time.ZoneId;

public class Demo {
    public static void main(String[] args) {
        // two ways using now() function
        LocalDate date = LocalDate.now();
        System.out.println(date);

     // way2 - to get current date using zoneid
        ZoneId zone= ZoneId.of("Europe/Paris");
        LocalDate date1 = LocalDate.now(zone);
        System.out.println("Date from paris:"+date1);

        // ways using of() method
        LocalDate date3= LocalDate.of(2023,8,21);
        System.out.println(date3);

        //way2 using parse
        LocalDate date4= LocalDate.parse("2023-08-06");
        System.out.println(date4);

       LocalDate newdate= date3.plusDays(2);
        System.out.println("new date:"+newdate);

        LocalDate minusdate= date3.minusDays(2);
        System.out.println(minusdate);



    }
}