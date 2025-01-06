import java.util.ArrayList;
public class basic_arraylist{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //                      Get operation in array list 
    
        int element=list.get(2);
        System.out.println(element);

        //                        Remove opration in Arraylist 

        list.remove(2);
        System.out.println(list);

        //                        Set element opration in arraylist 

        list.set(2,10);
        System.out.println(list);

       //             Contains Element   

       System.out.println(list.contains(1));
       System.out.println(list.contains(12));


       //                    Size of Arraylist 

       System.out.println(list.size());

    
       for(int  i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
       }
    }
}