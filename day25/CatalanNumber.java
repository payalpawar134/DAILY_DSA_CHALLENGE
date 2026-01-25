public class CatalanNumber {

    
    static int findWays(int n) {
        // If n is odd, no valid ways
        if (n % 2 != 0) {
            return 0;
        }

        int pairs = n / 2;
        long catalan = 1;

        for (int i = 0; i < pairs; i++) {
            catalan = catalan * 2 * (2 * i + 1) / (i + 2);
        }

        return (int) catalan;
    }

    
    public static void main(String[] args) {

        
        int n = 6;

        int result = findWays(n);
        System.out.println("Number of ways (Catalan Number) for n = " + n + " is: " + result);
    }
}
