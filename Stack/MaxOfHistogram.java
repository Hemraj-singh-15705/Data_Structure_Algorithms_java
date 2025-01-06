import java.util.*;

public class MaxOfHistogram {
    public static void maxArea(int arr[]) {
        int nsr[] = new int[arr.length]; // Next Smaller to Right
        int nsl[] = new int[arr.length]; // Next Smaller to Left
        int maxArea = 0;

        Stack<Integer> s = new Stack<>();
        
        // Next Smaller to Right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        
        // Next Smaller to Left
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate max area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max area in histogram: " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 10, 2, 1};
        maxArea(arr);
    }
}
