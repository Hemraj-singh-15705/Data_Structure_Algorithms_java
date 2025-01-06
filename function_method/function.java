import java.util.*;
public class function {
    public static void helloworld(){
        System.out.println("hello dear friend");
        System.out.println("hello dear friend");
        System.out.println("hello dear friend");
    }
     public static void calculate_sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any two number a &b :~ ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is ="+sum);
    } 
    //function in parameters :
    public static void sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        helloworld();
        calculate_sum();
       int  num1=25;
       int  num2=65;
       sum (num1 , num2);
}       
}