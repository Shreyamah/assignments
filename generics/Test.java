
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
  public static void main(String[] args) {

    MyGeneric<Integer> generic1 = new MyGeneric<>();
    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(11);
    list1.add(12);
    generic1.setList(list1);
    List<Integer> list = generic1.getList();
    list.forEach(System.out::println);
    MyGeneric<String> generic2 = new MyGeneric<>();
    List<String> list2 = new LinkedList<>();
    list2.add("FIRST");
    list2.add("SECOND");
    list2.add("THIRD");
    generic2.setList(list2);
    // List<String> slist = generic2.getList();
    // slist.forEach(System.out::println);
    System.out.println(list2);
  }
}
