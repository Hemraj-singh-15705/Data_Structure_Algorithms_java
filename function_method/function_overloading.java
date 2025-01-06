//FUNCTION OVERLOADING :~~~~~ CLASS NAME SAME BUT ARGUMENT PARAMETER  DIFFERENT ********
public class function_overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
       System.out.println("Sum  is ="+sum(56,58));
       System.out.println("Sum is ="+ sum(5,67,8));
    }
}
