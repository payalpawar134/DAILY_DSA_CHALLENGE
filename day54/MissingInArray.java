public class MissingInArray {

    static int missingNum(int arr[]) {
        int n = arr.length + 1;
        long total = (long) n * (n + 1) / 2;
        long sum = 0;

        for (int x : arr) {
            sum += x;
        }

        return (int) (total - sum);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};

        int result = missingNum(arr);

        System.out.println("Missing Number: " + result);
    }
}