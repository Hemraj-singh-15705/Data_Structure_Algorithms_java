public class kadan_s {
    public static void maxSubArray(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
       
        
        for(int i=0; i < nums.length; i++){
            cs = cs + nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
       maxSubArray(nums);
    }
}
