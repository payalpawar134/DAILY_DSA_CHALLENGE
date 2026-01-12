import java.util.*;

public class subarraymaximum {
    public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peek() == i-k){  // peek() for front
                dq.poll();  // poll() for front
            }
            
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.pollLast();
            }
            dq.offer(i);
            
            if(i >= k-1){
                result.add(arr[dq.peek()]);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> result = maxOfSubarrays(arr, k);
        System.out.println(result);  // [3, 3, 5, 5, 6, 7]
    }
}
