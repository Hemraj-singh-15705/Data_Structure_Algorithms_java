import java.util.*;
public class prime{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc. nextInt();
for(int i=2; i<=Math.sqrt(n);i++){
    if(n%i==0){
        System.out.println(" n is not prime ");
    }
    else{
        System.out.println("n is prime ");
    }
}
   }
}