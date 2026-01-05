import java.util.*;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = {1, 4, 2, 10, 23, 3, 1, -4, -1, -27, 1};
        int k1 = 4;
        Solution sol = new Solution();
        System.out.println("Max sum for arr1, k=4: " + sol.maxSubarraySum(arr1, k1));
        
        sc.close();
    }
}

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int current = 0;
        for(int i = 0; i < k; i++){
            current = current + arr[i];
        }
        int max = current;
        for(int i = 1; i <= arr.length - k; i++){
            current = current - arr[i-1] + arr[i+k-1];
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
