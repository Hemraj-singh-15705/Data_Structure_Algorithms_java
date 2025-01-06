import java.util.*;
public class swap_number {
   public static void swap(ArrayList <Integer> list ,int idx1,int idx2){
    int temp=list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2,temp);
   } 
   public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(21);
    list.add(37);
    list.add(45);
    list.add(51);
    list.add(61);
    list.add(37);
    list.add(80);
    int idx1=1;
    int idx2=3;
    System.out.println(list);
    swap (list,idx1,idx2);
    System.out.println(list);
    //                                Array List Sorting 
    Collections.sort(list);
    System.out.println(list);
   }
   
}
