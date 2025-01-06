public class BinomialCofficent {
    public static int Factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++)
        f=f*i;
       return f;
    }

    public static int BinCOff(int n,int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int BinCOff = fact_n/(fact_r*fact_nmr);
        return BinCOff;
    }
    public static void main(String[] args) {
        System.out.println(BinCOff(5,2));
    }
}
