public class RangeAddition {

    
    public static int maxCount(int m, int n, int[][] ops) {

        
        if (ops.length == 0) {
            return m * n;
        }

        int minRow = m;
        int minCol = n;

        
        for (int i = 0; i < ops.length; i++) {
            minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
        }

        return minRow * minCol;
    }

    
    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        int[][] ops = {
            {2, 2},
            {3, 3}
        };

        int result = maxCount(m, n, ops);
        System.out.println("Output: " + result);
    }
}
