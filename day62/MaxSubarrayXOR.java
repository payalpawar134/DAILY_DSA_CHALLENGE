class MaxSubarrayXOR {

    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        int xor = 0;

        // XOR of first window
        for(int i = 0; i < k; i++){
            xor ^= arr[i];
        }

        int max = xor;

        // Sliding window
        for(int i = 1; i <= n - k; i++){
            xor = xor ^ arr[i-1] ^ arr[i+k-1];
            max = Math.max(max, xor);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 1, 1, 3};
        int k = 3;

        MaxSubarrayXOR obj = new MaxSubarrayXOR();
        int result = obj.maxSubarrayXOR(arr, k);

        System.out.println("Maximum XOR of subarray of size " + k + " is: " + result);
    }
}