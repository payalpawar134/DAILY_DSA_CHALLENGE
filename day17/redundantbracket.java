import java.util.Stack;

class Solution {
    public static boolean checkRedundancy(String s) {
    
        Stack<Character> stack = new Stack<>();
        
        for(int i= 0; i< s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ')'){
                boolean hasOperator = false;
                
                while (!stack.isEmpty() && stack.peek() != '('){
                    char top = stack.pop();
                    if(top == '+'|| top == '-'|| top == '*'|| top == '/'){
                        hasOperator = true;
                    }
                }
                stack.pop();
                
                if(!hasOperator){
                    return true;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }
}

public class redundantbracket {
    public static void main(String[] args) {
    
        String s = "(a+b)";
        System.out.println("Test case: " + s + " → " + Solution.checkRedundancy(s));
    }
}
