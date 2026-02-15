import java.util.Arrays;

public class EqualArrays {

    
    public static boolean areEqual(int[] a, int[] b) {

        
        if (a.length != b.length) {
            return false;
        }

        
        Arrays.sort(a);
        Arrays.sort(b);

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {

        
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};

        
        boolean result = areEqual(a, b);

        
        if (result) {
            System.out.println("Arrays are equal: true");
        } else {
            System.out.println("Arrays are equal: false");
        }
    }
}
