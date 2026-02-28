public class FloorFinder {

    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = mid;      
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 10, 10, 12, 19};

        int x1 = 5;
        int x2 = 11;
        int x3 = 0;

        System.out.println("Floor index for x = 5  : " + findFloor(arr, x1));
        System.out.println("Floor index for x = 11 : " + findFloor(arr, x2));
        System.out.println("Floor index for x = 0  : " + findFloor(arr, x3));
    }
}