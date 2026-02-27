public class FindExtraElement {

    public static int findExtra(int a[], int b[]) {
        for(int i = 0; i < b.length; i++){
            if(a[i] != b[i]){
                return i;
            }
        }
        return a.length - 1;
    }

    public static void main(String[] args) {

        int a[] = {2, 4, 6, 8, 10};
        int b[] = {2, 4, 8, 10};

        int index = findExtra(a, b);

        System.out.println("Index of extra element: " + index);
        System.out.println("Extra element is: " + a[index]);
    }
}