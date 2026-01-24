public class Josephus {
    
    public static int josephus(int n, int k) {
        int ans = 0; 

        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }

        return ans + 1; 
    }

    
    public static void main(String[] args) {

        
        int n = 5;
        int k = 2;

        int result = josephus(n, k);

        System.out.println("Survivor position is: " + result);
    }
}
