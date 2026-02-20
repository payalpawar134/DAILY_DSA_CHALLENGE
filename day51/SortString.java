import java.util.*;

public class SortString {

    static String sort(String s) {

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "edcab";

        String result = sort(s);

        System.out.println("Original String: " + s);
        System.out.println("Sorted String: " + result);
    }
}