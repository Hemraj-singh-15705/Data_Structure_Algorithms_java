import java.util.*;
public class most_frequent_number {
    public static int most_following_key(ArrayList<Integer> nums ,int key){
        int []count = new int[1001];

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) == key){
                count[nums.get(i+1)]++;
            }
        }
        int MaxValue=0;
        int target= 0;
        for(int i=0;i<count.length;i++){
            if(count[i] > MaxValue){
                target = i;
                MaxValue = count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        int ans = most_following_key(arr, k);
        System.err.println(ans);
    }
}