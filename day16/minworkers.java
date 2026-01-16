import java.util.*;

public class minworkers {
    public static int minMen(int[] arr) {
        int n = arr.length;
        ArrayList<int[]> intervals = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] != -1) {
                int start = Math.max(0, i - arr[i]);
                int end = Math.min(n-1, i + arr[i]);
                intervals.add(new int[]{start, end});
            }
        }
        
        if(intervals.isEmpty()) return -1;
        
        intervals.sort((a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]);
        });
        
        int workers = 0;
        int covered = -1;
        int i = 0;
        
        while(covered < n-1 && i < intervals.size()) {
            int maxEnd = covered;
            while(i < intervals.size() && intervals.get(i)[0] <= covered + 1) {
                maxEnd = Math.max(maxEnd, intervals.get(i)[1]);
                i++;
            }
            
            if(maxEnd == covered) return -1;
            covered = maxEnd;
            workers++;
        }
        
        return covered >= n-1 ? workers : -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,1,0};
        System.out.println(minMen(arr));  
    }
}
