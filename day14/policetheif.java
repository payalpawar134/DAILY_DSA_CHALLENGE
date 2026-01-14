import java.util.*;

public class policetheif {
    public int catchThieves(char[] arr, int k) {
        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thief = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'P')
                police.add(i);
            else if(arr[i] == 'T')
                thief.add(i);
        }
        
        int i = 0, j = 0;
        int count = 0;
        
        while(i < police.size() && j < thief.size()){
            if(Math.abs(police.get(i) - thief.get(j)) <= k){
                count++;
                i++;
                j++;
            }
            else if(police.get(i) < thief.get(j)){
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 2;
        System.out.println(new policetheif().catchThieves(arr, k));  
    }
}
