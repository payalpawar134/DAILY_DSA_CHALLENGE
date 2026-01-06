import java.util.*;

class MaxXorSubarray {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;

        int curXor = 0;
        for (int i = 0; i < k; i++) {
            curXor = curXor ^ arr[i];
        }

        int maxXor = curXor;

        for (int i = k; i < n; i++) {
            curXor = curXor ^ arr[i - k] ^ arr[i];
            maxXor = Math.max(maxXor, curXor);
        }
        return maxXor;
    }

    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        MaxXorSubarray sol = new MaxXorSubarray();
        int ans = sol.maxSubarrayXOR(arr, k);
        System.out.println("Max subarray XOR of size " + k + " = " + ans);
    }
}
