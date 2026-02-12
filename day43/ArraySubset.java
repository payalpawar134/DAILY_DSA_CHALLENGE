import java.util.*;

public class ArraySubset {

    public static boolean isSubset(int a[], int b[]) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0; 
        int j = 0; 

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                
                i++;
            }
            else {
                
                return false;
            }
        }

        return (j == b.length);
    } 
    public static void main(String[] args) {

        int a[] = {1, 2, 2};
        int b[] = {1, 1};

        boolean result = isSubset(a, b);

        System.out.println(result);
    }
}
