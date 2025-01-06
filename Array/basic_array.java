import java.util.*;
public class basic_array{
public static void main(String args[]){
int marks[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter the marks of math and physics or chemistry :)~~");
//create
marks[0]=sc.nextInt();
marks[1]=sc.nextInt();
marks[2]=sc.nextInt();
System.out.println("Math="+marks[0]);
System.out.println("physics="+marks[1]);
//update any number 
marks[2]=99;
System.out.println("chemistry ="+marks[2]);
//array of length 
System.out.println("Lenth of array="+marks.length);
}
}