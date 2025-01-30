import java.util.*;
public class CountDistinctElement {
    public static void main(String[] args) {
        int num[]= {4,3,2,1,4,3,5,6,7};

        HashSet<Integer> set = new HashSet<>();

        for(int s : num){
            set.add(s);
        }

        System.out.println(set.size());
    }
}
