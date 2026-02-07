class PalindromeString {
    public static void main(String[] args) {

        String str = "madam";   
        String rev = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
