import java.util.ArrayList;
import java.util.HashMap;

public class distinctelement {

    static ArrayList<Integer> countDistinct(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());

        for (int high = k; high < arr.length; high++) {

            int out = arr[high - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            
            int in = arr[high];
            map.put(in, map.getOrDefault(in, 0) + 1);

            ans.add(map.size());
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        ArrayList<Integer> result = countDistinct(arr, k);

        
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
