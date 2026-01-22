public class Subarrayranges {

    public static int subarrayRanges(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int max = arr[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);

                sum += (max - min);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3};

        int result = subarrayRanges(arr);
        System.out.println("Sum of subarray ranges: " + result);
    }
}
