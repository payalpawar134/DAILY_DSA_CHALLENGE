public class CountSubarrays {

    static class Solution {
        public int countSubarrays(int[] arr) {
            
            int n = arr.length;
            int count = 0;

            for(int i = 0; i < n; i++){

                for(int j = i; j < n; j++){

                    if(arr[j] >= arr[i]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};   

        Solution obj = new Solution();
        int result = obj.countSubarrays(arr);

        System.out.println("Number of valid subarrays: " + result);
    }
}