import java.util.HashSet;

public class UnionInterSection{
    public static void main(String[] args) {
        int num1 [] = {7,3,9};
        int num2 [] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num1.length; i++){
            set.add(num1[i]);
        }

        for(int i=0; i<num2.length; i++){
            set.add(num2[i]);
        }

        System.out.println("Union = "+ set.size());

        //Intersection 

        set.clear();

        for(int i=0; i<num1.length; i++){
            set.add(num1[i]);
        }

        int count = 0;
        for(int i=0; i<num2.length; i++){
            if(set.contains(num2[i])){
                count++;
                set.remove(num2[i]);
            }
        }


        System.out.println("InterSection = "+ count);

    }
}