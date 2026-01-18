import java.util.*;

class Solution {
    ArrayList<Integer> nextFreqGreater(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && freq.get(st.peek()) <= freq.get(arr[i])) {
                st.pop();
            }
            
            if (st.empty()) {
                result.add(-1);
            } else {
                result.add(st.peek());
            }
            
            st.push(arr[i]);
        }
        
    
        Collections.reverse(result);
        return result;
    }
}

public class GreaterFreq {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
        int[] arr = {2, 1, 1, 3, 2, 1};
        ArrayList<Integer> result = sol.nextFreqGreater(arr);
        
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
