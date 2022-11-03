import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        // arraylist to array
        Integer array[]=arr.stream().toArray(size-> new Integer[size]);
        System.out.println(Arrays.toString(array));
        //other way
        Integer arra[]=arr.toArray(size-> new Integer[size]);
        System.out.println(Arrays.toString(arra));
    }

}
