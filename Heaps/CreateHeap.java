import java.util.*;
public class CreateHeap {
    public class heap{ 
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //o(log(n))
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                //swap 
                int temp = arr.get(x);
                arr.set(x, arr.get(x));
                arr.set(par , temp);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
