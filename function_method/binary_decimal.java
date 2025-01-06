import java.util.*;
public class binary_decimal {
    public static void bintodec(int binnum){
        
        
        int mynum= binnum; 
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("Decimal of"+mynum+"="+decnum);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a binary number for convert in decimal : ) ~  ");
    int x=sc.nextInt();
    {
        bintodec(x);
    }
   }
}
