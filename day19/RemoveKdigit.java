import java.util.*;

public class RemoveKdigit {
    public static String removeKdig(String s, int k) {
        Deque<Character> dq = new ArrayDeque<>();
        
        for(char c : s.toCharArray()) {
            while(!dq.isEmpty() && k > 0 && dq.peekLast() > c) {
                dq.pollLast();
                k--;
            }
            dq.offerLast(c);
        }
        
        while(k > 0) {
            dq.pollLast();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean started = false;
        
        Iterator<Character> it = dq.iterator();
        while(it.hasNext()) {
            char c = it.next();
            if(!started && c == '0') continue;
            started = true;
            sb.append(c);
        }
        
        return sb.length() > 0 ? sb.toString() : "0";
    }
    
    public static void main(String[] args) {
        String result = removeKdig("388813", 4);
        System.out.println("Input: 388813, k=4");
        System.out.println("Output: " + result);  // 13
    }
}
