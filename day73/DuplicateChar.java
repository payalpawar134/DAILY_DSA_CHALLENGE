import java.util.Arrays;

public class DuplicateChar {

    public void duplicate(String str) {

        char arr[] = str.toCharArray(); 

        Arrays.sort(arr); 

        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;

            } else {
                if (count > 1) {
                    System.out.println(arr[i] + " appears " + count + " times");
                }

                count = 1;
            }
        }

        
        if (count > 1) {
            System.out.println(arr[arr.length - 1] + " appears " + count + " times");
        }
    }

    public static void main(String[] args) {

        DuplicateChar ch = new DuplicateChar();
        ch.duplicate("management"); 
    }
}