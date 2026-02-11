import java.util.Scanner;

public class StringRotation {

    // Function to check rotation
    public static boolean isRotated(String s1, String s2) {

        // If length is different, return false
        if (s1.length() != s2.length())
            return false;

        int n = s1.length();

        // If length is less than 2
        if (n < 2)
            return s1.equals(s2);

        // Left rotation by 2
        String left = s1.substring(2) + s1.substring(0, 2);

        // Right rotation by 2
        String right = s1.substring(n - 2) + s1.substring(0, n - 2);

        // Check match
        return s2.equals(left) || s2.equals(right);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Call function
        boolean result = isRotated(s1, s2);

        // Output
        System.out.println("Result: " + result);

        sc.close();
    }
}
