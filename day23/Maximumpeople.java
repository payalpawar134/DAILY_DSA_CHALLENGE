import java.util.*;

public class Maximumpeople {

    public static int maxPeople(int[] arr) {
        int n = arr.length;
        int[] leftBlock = new int[n];
        int[] rightBlock = new int[n];

        Stack<Integer> st = new Stack<>();

    
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            leftBlock[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            rightBlock[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int visibleLeft = i - leftBlock[i] - 1;
            int visibleRight = rightBlock[i] - i - 1;
            ans = Math.max(ans, visibleLeft + visibleRight + 1);
        }

        return ans;
    }

    
    public static void main(String[] args) {

        
        int[] arr = {6, 2, 5, 4, 5, 1, 6};

        int result = maxPeople(arr);
        System.out.println("Maximum people visible: " + result);
    }
}
