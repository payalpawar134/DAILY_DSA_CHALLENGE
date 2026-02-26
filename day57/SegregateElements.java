import java.util.Arrays;

public class SegregateElements {

    public static void segregateElements(int[] arr) {

        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // First store all positive elements
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                temp[index++] = arr[i];
            }
        }

        // Then store all negative elements
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                temp[index++] = arr[i];
            }
        }

        // Copy back to original array
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = { -1, 2, -3, 4, -5, 6 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        segregateElements(arr);

        System.out.println("After Segregation: " + Arrays.toString(arr));
    }
}