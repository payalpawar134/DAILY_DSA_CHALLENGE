public class NonRepeatingChar {

    public char nonRepeatingChar(String s) {

        int[] count = new int[26];

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (count[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '$';
    }

    
    public static void main(String[] args) {

       NonRepeatingChar obj = new NonRepeatingChar();

        
        String s = "geeksforgeeks";

        char result = obj.nonRepeatingChar(s);

        System.out.println("Input String: " + s);
        System.out.println("First Non-Repeating Character: " + result);
    }
}
