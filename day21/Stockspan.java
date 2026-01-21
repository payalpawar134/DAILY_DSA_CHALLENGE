import java.util.*;

public class Stockspan {
    public static ArrayList<Integer> calculateSpan(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> spans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            int span = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            spans.add(span);
            stack.push(i);
        }
        return spans;
    }
    
    public static void main(String[] args) {
        
        int[] prices = {100, 60, 70, 65, 80, 85};
        ArrayList<Integer> spans = calculateSpan(prices);
        
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Spans:  " + spans);
    }
}
