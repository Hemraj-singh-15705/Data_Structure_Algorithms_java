public class Trap_rainWater {
    public static int trapping(int height[]){
        int n = height.length;
        //calculate left max boundary 
        int leftmax[] =new int[height.length] ;
        leftmax[0]=height[0];
        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary 
         int rightMax[] = new int[n];
         rightMax[n-1]= height[n-1];
         for(int i=n-2; i>=0 ; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
         }
        //loop
         int trapWater = 0;
         for(int i =0 ; i<n; i++){
        // water level = min(leftMax ,rightMax)
            int waterLevel = Math.min(leftmax[i],rightMax[i]);
        //trapping water  = water level - height[i]
            trapWater+=waterLevel-height[i];
         }
         return trapWater;
         
        
    }

    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trapping(height));
    }
}
