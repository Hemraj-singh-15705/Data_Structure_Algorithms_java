public class pairs_array {
    public static void Getpairs(int nums[]){
        int tp = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                System.out.print("("+nums[i]+","+nums[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pair :"+tp);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12};
        Getpairs(nums);
    }
    
}
