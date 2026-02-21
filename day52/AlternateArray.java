import java.util.ArrayList;

class AlternateArray {

    public ArrayList<Integer> getAlternates(int arr[]) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // Start from index 0 and jump by 2
        for(int i = 0; i < arr.length; i += 2){
            list.add(arr[i]);
        }
        
        return list;
    }

    public static void main(String[] args) {

        AlternateArray obj = new AlternateArray();

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> result = obj.getAlternates(arr);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}