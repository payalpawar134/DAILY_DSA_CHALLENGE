import java.util.*;

public class SegregateEvenOdd {

    void segregateEvenOdd(int arr[]) {

        int[] arr1 = new int[arr.length];
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr1[index++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                arr1[index++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr1[i];
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        SegregateEvenOdd obj = new SegregateEvenOdd();
        obj.segregateEvenOdd(arr);

        System.out.println("Array after segregating even and odd:");

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}