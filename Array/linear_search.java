import java.util.*;
public class linear_search {
  public static int linear(int number[],int key){
    for(int i=0;i<number.length; i++){
        if(number[i]==key){
            return i;
        }
      }
    return -1;
  }
  public static void main(String[] args) {
    int number[]={2,4,8,16,10,12};
    //int key=10;
    System.out.print("Enter the key number :");
  Scanner sc=new Scanner(System.in);
  int key=sc.nextInt();
    int index=linear(number ,key);
    if(index==-1){
        System.out.println("Key is not found"); 
    }
    else
     System.out.println("Key is at index=" + index);
  }
}