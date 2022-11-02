import java.util.LinkedList;


public class Demo {
        public static void  main(String[] args){
            LinkedList<Integer> list= new LinkedList<>();
            list.add(6);
            list.add(9);
            list.add(10);
            list.add(4);
            System.out.println(list);
            list.addFirst(50);
            System.out.println("new"+list);
            list.add(3,30);
            System.out.println("new"+list);


        }
    }

