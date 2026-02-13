import java.util.Scanner;

public class SpecificDifference {

    
    private static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;   
            num /= 10;        
        }

        return sum;
    }

    public static int getCount(int n, int d) {

        int count = 0;

        
        for (int i = 1; i <= n; i++) {

            int sum = digitSum(i);

        
            if (i - sum >= d) {
                count++;
            }
        }

        return count;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        int result = getCount(n, d);

        System.out.println("Result = " + result);

        sc.close();
    }
}
