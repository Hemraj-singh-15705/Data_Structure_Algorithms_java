//****************SWAP PROGRAM BY FUNCTION CALLING WITH ARGUMENT 
import java.util.*;
public class function_swap {
    public static void swap(int a,int b){
        int tem=a;
        a=b;
        b=tem;
        System.out.println("***************AFTER SWAP***********");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
  
// **************FACTORIAL OF N NUMBER WITH ARGUMENT  ************//
public static void Factorial(int n){
    int f=1;
    for(int i=1; i<=n; i++)
    f=f*i;
    System.out.println("****************************************");
    System.out.println("factorial="+ f);
}
 
 

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("******Enter A & B******");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
        Factorial(5);
    }
}