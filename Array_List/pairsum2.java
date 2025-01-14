import java.util.*;
public class pairsum2 {
      public static Boolean pairsum(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
      }

    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(15);
        list.add(18);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(12);
        int target=12;
       System.out.println(pairsum(list,target));
    }
}
