public class TilingProblem {
    public static int tilingWay(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical 
        int fnm1 = tilingWay(n-1);
        //horizontal
        int fnm2 = tilingWay(n-2);

        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilingWay(4));
    }
}
