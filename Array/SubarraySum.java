public class SubarraySum {
    public static void printSubarraySum(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length; j++){
                currsum =0;
                for(int k = i; k<=j; k++){
                    currsum += number[k];
                    
                }
                System.out.println(currsum +" ");
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
        
    public static void main(String[] args) {
        int number[] = {2,4,6};
        printSubarraySum(number);
    }
}
