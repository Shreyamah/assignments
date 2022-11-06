import java.util.HashMap;
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, Double> hm1 = new HashMap<Integer, Double>(11);
        hm1.put(12,56.8);
        hm1.put(5,24.89);
        hm1.put(10,565.8);
        hm1.put(4, 16.08);
        hm1.put(19, 66.05);
        hm1.put(10, 2.003);
        hm1.put(34, 43.89);
        hm1.put(23, 67.078);
        hm1.put(4, 98.45);
        hm1.put(20, 55.88);
        System.out.print(new StringBuilder().append("Mappping of HashMap hm1 ").append(hm1).toString());
    }
}