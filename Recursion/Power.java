public class Power { //  TC = O(logn)
    public static int OptmizePower(int a,int n){
        if(n == 0){
            return 1;
        }
        int Powerhalf = OptmizePower(a, n/2);
        int PowerhalfSq = Powerhalf *Powerhalf;
        if(n%2 !=0){
            PowerhalfSq = a*PowerhalfSq;
        }
        return PowerhalfSq;
    }
    public static void main(String[] args) {
        System.out.println(OptmizePower(2, 5));
    }
}
