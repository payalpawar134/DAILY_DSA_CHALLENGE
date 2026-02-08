import java.util.*;

public class RemoveDuplicates {

    String removeDups(String s) {
        
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        
        RemoveDuplicates obj = new RemoveDuplicates();

        
        String s = "zvvo";   

        String ans = obj.removeDups(s);

        System.out.println("Original String: " + s);
        System.out.println("After Removing Duplicates: " + ans);
    }
}
