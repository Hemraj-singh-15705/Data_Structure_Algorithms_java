//SWAP TWO NUMBER WITHOUT USING THIRD VARIABLE 

import java.util.*;
public class swap_without_third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number :) ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        x=x^y;
        y=y^x;
        x=x^y;
        System.out.println("After swap x  "+  x   +"\nAfter swap y  "+ y);
       //add 1 number by using not operation 25

        int s=10;
        s=-~s;
        System.out.println("S is ="+s);
        //int a;
        System.out.println(s|32);
    }
}
