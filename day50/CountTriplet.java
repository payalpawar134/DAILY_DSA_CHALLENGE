import java.util.Arrays;

public class CountTriplet {

    static int countTriplet(int arr[]) {

        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);

        for (int i = n - 1; i >= 2; i--) {

            int left = 0;
            int right = i - 1;

            while (left < right) {

                int sum = arr[left] + arr[right];

                if (sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                }
                else if (sum < arr[i]) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 2};

        int result = countTriplet(arr);

        System.out.println("Number of triplets: " + result);
    }
}
