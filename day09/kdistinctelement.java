import java.util.*;

class kdistinctelement {
    public static int countAtMostK(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int distinct = 0;
        long ans = 0;

        for (int right = 0; right < n; right++) {
            int val = arr[right];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            if (freq.get(val) == 1) {
                distinct++;
            }

            while (distinct > k && left <= right) {
                int lv = arr[left];
                freq.put(lv, freq.get(lv) - 1);
                if (freq.get(lv) == 0) {
                    distinct--;
                }
                left++;
            }

            ans += (right - left + 1);
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int k = 2;
        System.out.println(countAtMostK(arr, k));  // Output: 9
    }
}
