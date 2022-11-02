import java.lang.*;
import java.util.*;

public class Unique {
    public static void main(String args[])
    {
        HashSet<String> obj=new HashSet<>();
        obj.add("Shreya");
        obj.add("Roop");
        obj.add("Roop");
        obj.add("Rishi");

        System.out.println(obj);
    }
}
