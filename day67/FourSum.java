import java.util.*;

class Compute {
    boolean find4Numbers(int A[], int n, int X) {

        for(int i = 0; i < n-3; i++){
            for(int j = i+1; j < n-2; j++){
                for(int k = j+1; k < n-1; k++){
                    for(int l = k+1; l < n; l++){

                        int sum = A[i] + A[j] + A[k] + A[l];

                        if(sum == X){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

public class FourSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        System.out.print("Enter target sum X: ");
        int X = sc.nextInt();

        Compute obj = new Compute();
        boolean result = obj.find4Numbers(A, n, X);

        if(result)
            System.out.println("Output: 1");
        else
            System.out.println("Output: 0");
    }
}