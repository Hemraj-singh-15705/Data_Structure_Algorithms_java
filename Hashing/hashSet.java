import java.util.*;
public class hashSet{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

       HashSet<String> city = new HashSet<>();
       city.add("allahabad");
       city.add("delhi");
       city.add("kanpur");
       city.add("mumbai");

    //    Iterator it = city.iterator();
    //    while (it.hasNext()) {
    //     System.out.println(it.next());
    //    }

    for(String ct : city ){
        System.out.print(ct+" ");
    }
    System.out.println();


    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("delhi");
    lhs.add("allahabad");
    lhs.add("delhi");
    lhs.add("kanpur");
    lhs.add("mumbai");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("allahabad");
        ts.add("delhi");
        ts.add("kanpur");
        ts.add("mumbai");
            System.out.println(ts);

    }

    
}