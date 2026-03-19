import java.util.*;

public class CountVowels {

    public static void main(String args[]){

        int count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String str=sc.nextLine();

        for(int i=0; i<str.length(); i++){
             Character ch = str.charAt(i);

            if(ch == 'a'||ch== 'i' ||ch== 'u' || ch=='o' ||ch== 'e'
             ||ch=='A'|| ch=='I' || ch=='O' || ch=='U' || ch== 'E')
               count++;

        }
        System.out.println(count);
    }
    
}
