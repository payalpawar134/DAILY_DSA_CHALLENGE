import java.util.*;

public class Intersection {

    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr1) {
            set.add(num);
        }

        for(int num : arr2) {
            if(set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        ArrayList<Integer> answer = intersection(arr1, arr2);

        System.out.println("Intersection Elements:");
        for(int num : answer) {
            System.out.print(num + " ");
        }
    }
}