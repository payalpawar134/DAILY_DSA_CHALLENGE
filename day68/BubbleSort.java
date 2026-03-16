import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int temp = 0;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){

                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}