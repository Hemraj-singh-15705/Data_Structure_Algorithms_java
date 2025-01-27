import java.util.*;
public class lhm {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lh = new LinkedHashMap<>();
        lh.put("india", 150);
        lh.put("Nepal", 50);
        lh.put("Us", 100);

        HashMap<String , Integer> lh2 = new HashMap<>();
        lh2.put("india", 150);
        lh2.put("Nepal", 50);
        lh2.put("Us", 100);

        System.out.println(lh2);
        System.out.println(lh);

    }
}
