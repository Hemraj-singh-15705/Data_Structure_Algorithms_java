import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulArray {
    public static ArrayList<Integer> beautifulArry(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size() < n){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int ans_size = ans.size();

            for(int i=0; i<ans_size;i++){
                if((ans.get(i)*2-1)<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0; i<ans_size;i++){
                if((ans.get(i)*2)<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        ArrayList<Integer> ans = beautifulArry(n);
        int ans_size = ans.size();
        for(int i=0;i<ans_size;i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}






// leetcode






// public int[] beautifulArray(int n) {
//     // Base case: when n is 1, return the array [1]
//     if (n == 1) {
//         return new int[]{1};
//     }
    
//     // Recursive case: divide the problem into two parts (odds and evens)
//     int[] arr = new int[n];
    
//     // Generate the odds part of the beautiful array
//     int[] odds = beautifulArray((n + 1) / 2);
//     // Generate the evens part of the beautiful array
//     int[] evens = beautifulArray(n / 2);
    
//     // Populate the current array with odds (2 * x - 1)
//     for (int i = 0; i < odds.length; i++) {
//         arr[i] = odds[i] * 2 - 1;
//     }
    
//     // Populate the current array with evens (2 * x)
//     for (int i = 0; i < evens.length; i++) {
//         arr[odds.length + i] = evens[i] * 2;
//     }
    
//     return arr;
// }
