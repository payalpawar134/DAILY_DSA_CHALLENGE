import java.util.Scanner;

class countsubarray {
    public int countSubarrays(int[] arr, int k) {
        return atMost(arr, k) - atMost(arr, k - 1);
    }

    private int atMost(int[] arr, int k) {
        int left = 0;
        int oddCount = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (arr[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        countsubarray obj = new countsubarray();
        int result = obj.countSubarrays(arr, k);
        System.out.println("Number of subarrays with exactly " + k + " odd numbers: " + result);
        
        sc.close();
    }
}
