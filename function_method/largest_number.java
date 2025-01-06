//largest three digit number program 
import java.util.*;
public class largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:)");
        int a=sc.nextInt();
        System.out.println("Enter b number:)");
        int b=sc.nextInt();
        System.out.println("Enter c number:)");
        int c=sc.nextInt();
        if((a>=b)&&(a>=c)){ 
            System.out.println("A is largest number :)"); 
        }
         else if(b>=c)
            System.out.println("b is largest number :)");
        else 
            System.out.println("c is largest number :)");
    }
}