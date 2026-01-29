import java.util.*;

public class StreamFirst {

    
    static class Solution {
        public String firstNonRepeating(String s) {
            int[] freq = new int[26];
            Queue<Character> q = new LinkedList<>();
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                freq[ch - 'a']++;
                q.add(ch);

                while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                    q.poll();
                }

                if (q.isEmpty()) {
                    ans.append('#');
                } else {
                    ans.append(q.peek());
                }
            }
            return ans.toString();
        }
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();

        
        String s = "aabc";

        String result = sol.firstNonRepeating(s);
        System.out.println("Output: " + result);
    }
}
