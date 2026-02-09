public class KRotation {

    public static int findKRotation(int arr[]) {
        
        int min = arr[0];
        int index = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {

        
        int arr[] = {5, 1, 2, 3, 4};

        int k = findKRotation(arr);

        System.out.println("Number of right rotations: " + k);
    }
}
