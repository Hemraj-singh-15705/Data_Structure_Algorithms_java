import java.util.*;
public class dec_to_bin {
    public static void dectobin(int n){
        int mynum=0;
        int binnum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of :)"+mynum+"="+binnum);
    }
    public static void main(String[] args) {
        System.out.print("Enter A decimal number :) ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        dectobin(a);
    }
}
