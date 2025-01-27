import java.util.*;
public class classroom {
    public static void main(String[] args) {

        //create    O(1)
        HashMap<String,Integer >hm = new HashMap<>();

        //insert    O(1)
        hm.put("India", 150);
        hm.put("china", 200);
        hm.put("us",150);


        /* 
        System.out.println(hm);

        //get   O(1)
        System.out.println(hm.get("India"));

        //containsKey  O(1)

        System.out.println(hm.containsKey("India"));  // return true , because this key is exist in my hashMap 

        System.out.println(hm.containsKey("other")); // return false , because this key does not exist in my hashMap 


        //Remove O(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty 
        System.out.println(hm.isEmpty());  //  return false because current time not empty this our hashmap 

        //clear -->> this function use for delete all element from HashMap

        hm.clear();
        System.out.println(hm);
        */
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key ="+k+  "  , value ="+hm.get(k));
        }
    }
}
