import java.util.Scanner;

public class sortingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int[] output = new int[10];
        
        // Input
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            input[i] = sc.nextInt();
        }
        
        // Counting Sort - Fixed version
        int[] count = new int[1001];  // 0 to 1000 range
        
        // Count frequencies
        for (int i = 0; i < 10; i++) {
            count[input[i]]++;
        }
        
        // Build output using frequencies
        int idx = 0;
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j < count[i]; j++) {
                output[idx++] = i;
            }
        }
        
        // Output
        System.out.print("Ascending: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
