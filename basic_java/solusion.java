
import java.util.*;
public class solusion{
  

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==1){
        System.out.println("Weird"); }
        else if(n<=5){
        System.out.println("Not Weird");  }
        else if (n<=20){
        System.out.println("Weird"); }
        else if (n>=20){
        System.out.println("Not Weird");}
        
    }
}