import java.util.*;

public class busticketchange {
    public static boolean canServe(int[] arr) {
        int five = 0;
        int ten = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                five++;
            } else if (arr[i] == 10) {
                if (five == 0)
                    return false;
                five--;
                ten++;
            } else {  // 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {5, 5, 5, 10, 20};
        System.out.println("Test 1: " + canServe(arr1));  // true

        // Test case 2
        int[] arr2 = {5, 5, 10, 10, 20};
        System.out.println("Test 2: " + canServe(arr2));  // false

        // Add more tests here
    }
}
