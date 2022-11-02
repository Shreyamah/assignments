import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year)
    {
        this.date=d;
        this.Month=Month;
        this.year=year;
    }


    public String toString() {
       return date+"-"+Month+"-"+year;
    }
}
public class Demo {
    public static void main(String args[]) {
        LinkedList<Date> list = new LinkedList<>();
        Date d1 = new Date(25, 7, 2001);
        Date d2 = new Date(10, 11, 2000);
        Date d3 = new Date(13, 12, 2011);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println(list);
        Iterator<Date> itr=list.iterator();
        while(itr.hasNext())
        {
            Date d=(Date)itr.next();
            Integer date=d.date;
            Integer month=d.Month;
            Integer year=d.year;
            if(year%400==0 || year%4==0)
            {
                System.out.println("The date of birth is  leap year");
            }
            else
            {
                System.out.println("The date of birth is  is not leap year");
            }

        }

    }

}