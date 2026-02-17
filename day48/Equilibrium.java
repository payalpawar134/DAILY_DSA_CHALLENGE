import java.util.*;

public class Equilibrium {

    public static int findEquilibrium(int arr[]) {

        int sum = 0, left = 0;

        
        for (int x : arr) {
            sum += x;
        }

        
        for (int i = 0; i < arr.length; i++) {

            sum -= arr[i];   

            if (left == sum) {
                return i;
            }

            left += arr[i];
        }

        return -1;
    }

    
    public static void main(String[] args) {

    
        int[] arr = {1, 2, 0, 3};

        int result = findEquilibrium(arr);

        System.out.println("Equilibrium Index: " + result);
    }
}
