import java.util.Comparator;
import java.util.PriorityQueue;
public class classRoom{
    
    public static void main(String[] args) {
        //Ascending Order 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Descending Order 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}