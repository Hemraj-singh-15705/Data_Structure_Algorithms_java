public class friendsPairing {
    public static int Friend(int n){
        if(n==1||n==2){
            return n;
        }
        //single 
        int fnm1 = Friend(n-1);
        //pair
        int fnm2 = Friend(n-2);
        int pairWay = (n-1)*fnm2;
        // this (n-1) means is self include remove  
        int totalWay = fnm1+pairWay;
        return totalWay;

        //OR

        // return Friend(n-1)+(n-1)*Friend(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Friend(3));
    }
}
