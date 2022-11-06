import java.util.*;

public class EmployeeDemo {

    public static void main(String args[]) {
        HashSet<Employee<Integer,String,Integer,String>> hashSet = new HashSet<>();
        Employee<Integer,String,Integer,String> e1 =  new Employee<>(1,"Shreya",15000,"analyst");
        Employee<Integer,String,Integer,String> e2 =  new Employee<>(2,"Vidhi",2000,"manager");


            hashSet.add(e1);
            hashSet.add(e2);


        for(Employee<Integer,String,Integer,String> i: hashSet) {
            i.displayDetails();
        }

    }


}


