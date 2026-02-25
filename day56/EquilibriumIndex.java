public class EquilibriumIndex {

    public static int findEquilibrium(int arr[]) {

        int sum = 0, left = 0;

        for (int x : arr) {
            sum += x;
        }

        for (int i = 0; i < arr.length; i++) {

            sum -= arr[i];  

            if (left == sum) {
                return i;   
            }

            left += arr[i];
        }

        return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        System.out.println("Given Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        int index = findEquilibrium(arr);

        if (index == -1) {
            System.out.println("Result: No Equilibrium Index Found ❌");
        } else {
            System.out.println("Result: Equilibrium Index Found ✅");
            System.out.println("Index Position: " + index);
            System.out.println("Element Value: " + arr[index]);
        }
    }
}