public class TowerOfHonoi {
    public static void toh(int n,int a,int c,int b){
        if(n==0){
            return ;
        }
        toh(n-1,a,b,c);
        System.out.println("Moving "+n+"th disk from "+a+" to "+c);
        toh(n-1, b, c, a);
    }
    public static void main(String[] args) {
        toh(3,1,3,2);
    }
}
