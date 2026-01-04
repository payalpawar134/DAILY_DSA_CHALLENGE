public class ReverseArray{

    static void reverseArray(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }
    public static void main(String args[]){

        int arr[]={1,2,3,4,5};
        System.out.println("Original array");
        for(int x: arr)
        System.out.print(x+" ");

        reverseArray(arr);

        System.out.println("\nReversed array");
        for(int x : arr)
        System.out.print(x+ " ");

    }
}