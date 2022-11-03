import java.time.LocalDateTime;

public class DateandTime {
    public static void main(String[] args){
        LocalDateTime obj= LocalDateTime.now();
        System.out.println(obj);
        LocalDateTime demo5= LocalDateTime.parse("2016-09-07T06:30:30");
        System.out.println(demo5);

    }
}
