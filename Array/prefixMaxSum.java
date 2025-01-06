public class prefixMaxSum {
    public static void printMaxSubArray(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+number[i];
        }
        int currsum = 0;
        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j =i; j<number.length; j++){
               int end = j;
            //    currsum =start==0?prefix[end]:prefix[j]-prefix[i-1];
            if(i==0){
                currsum = prefix[j];
            }
            else{
                currsum = prefix[j]-prefix[i-1];
            }
            if(currsum > maxsum){
                maxsum = currsum;
            System.out.println(currsum);
            }
            }
        }
        System.out.println("Max sum of array = "+ maxsum);
    }
    public static void main(String[] args) {
        int number[]= {2,4,6,8,12};
        printMaxSubArray(number);
    }
}
