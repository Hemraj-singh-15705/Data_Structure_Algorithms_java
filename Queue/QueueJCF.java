import java.util.*;
public class QueueJCF {
    public static void main(String[] args) {
       // Queue q = new Queue(3); // Pass the size of the queue
       Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
