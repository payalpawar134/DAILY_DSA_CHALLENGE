class substringkelement {
    public static int countSubstr(String s, int k) {
        int n = s.length();
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;
            
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                if (freq[idx]++ == 0) {
                    distinct++;
                }
                
                if (distinct > k) {
                    break;
                }
                
                if (distinct == k) {
                    ans++;
                }
            }
        }
        
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "abcdew";  
        int k = 2;
        
        substringkelement sol = new substringkelement();
        int result = sol.countSubstr(s, k);
        
        System.out.println("Number of substrings with exactly " + k + " distinct characters: " + result);
        
    }
}
