class Solution {
    public String largestString(String s) {
        String max = s;
        int n = s.length();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                
                char[] arr = s.toCharArray();
                
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                String newStr = new String(arr);
                
                if(newStr.compareTo(max) > 0){
                    max = newStr;
                }
            }
        }
        
        return max;
    }
}

public class LargestLexicographicSwap {
    public static void main(String[] args) {
        
        Solution obj = new Solution();

        String s1 = "768";
        String s2 = "333";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.largestString(s1));

        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Output: " + obj.largestString(s2));
    }
}