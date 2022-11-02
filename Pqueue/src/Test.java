import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(1);
        pq.add(20);
        pq.add(3);
        pq.add(4);
        // returning default ordering of queue (ascending)
        while(pq.peek() !=null) {
            System.out.println(pq.poll());
        }
    }
}
