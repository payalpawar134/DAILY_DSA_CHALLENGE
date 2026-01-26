import java.util.*;

public class PermutationofArray {

    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, result);
        return result;
    }

    static void backtrack(int[] arr, int index, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            backtrack(arr, index + 1, result);
            swap(arr, index, i); // backtrack
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};   

        ArrayList<ArrayList<Integer>> ans = permuteDist(arr);

        System.out.println("Permutations are:");
        for (ArrayList<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
