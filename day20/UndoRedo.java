import java.util.Stack;

class Solution {
    String str = "";
    Stack<Character> stack = new Stack<>();

    public void append(char x) {
        // append x into document
        str = str + x;
    }

    public void undo() {
        // undo last change
        if (str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            stack.push(lastChar);
            str = str.substring(0, str.length() - 1);
        }
    }

    public void redo() {
        // redo changes
        if (!stack.isEmpty()) {
            char ch = stack.pop();
            str = str + ch;
        }
    }

    public String read() {
        // read the document
        return str;
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        Solution doc = new Solution();
        
        // append 'A', 'B'; undo to "A"; redo to "AB"
        doc.append('A');
        System.out.println("After append A: " + doc.read());
        
        doc.append('B');
        System.out.println("After append B: " + doc.read());
        
        doc.undo();
        System.out.println("After undo: " + doc.read());
        
        doc.redo();
        System.out.println("After redo: " + doc.read());
    }
}
