public class RemoveConsonants {

    public static String removeConsonants(String s) {
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                result += ch;
            }
        }
        
        if(result.equals("")){
            return "No Vowel";
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        String s = "abEkipo";   
        
        String result = removeConsonants(s);
        
        System.out.println("Input String: " + s);
        System.out.println("Output: " + result);
    }
}