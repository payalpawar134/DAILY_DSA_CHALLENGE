import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        // Single test case from your example
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        
        ArrayList<Integer> result = findUnion(a, b);
        
        System.out.println("Input a: " + Arrays.toString(a));
        System.out.println("Input b: " + Arrays.toString(b));
        System.out.println("Union: " + result);
    }
    
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        
        // Add all elements from array a
        for (int num : a) {
            set.add(num);
        }
        
        // Add all elements from array b
        for (int num : b) {
            set.add(num);
        }
        
        // Convert set to ArrayList
        return new ArrayList<>(set);
    }
}
