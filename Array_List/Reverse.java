import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        for(int i=list.size()-1; i>=0;  i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int max =Integer.MIN_VALUE;
        for(int j=0; j<list.size(); j++){
            if(max<list.get(j)){
             max=list.get(j);
            }
        }
        System.out.println("Max element ="+ max);
    }

}
