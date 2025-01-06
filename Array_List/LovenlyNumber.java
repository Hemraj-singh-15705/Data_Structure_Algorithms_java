import java.util.*;

public class LovenlyNumber {
    public static ArrayList<Integer> findLovenly(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();
        Collections.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && (nums.get(i-1) == nums.get(i)-1 || nums.get(i-1) == nums.get(i))){
                continue;
            }
            if(i!=n-1 && (nums.get(i+1) == nums.get(i)+1 || nums.get(i+1) == nums.get(i))){
                continue;
            }
            result.add(nums.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        ArrayList<Integer> ans = findLovenly(arr);

        int ans_size = ans.size();
        for(int i=0; i<ans_size;i++){
            System.err.print(ans.get(i) +" ");
        }
    }
}
