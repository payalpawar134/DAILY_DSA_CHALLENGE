import java.util.*;

public class ReverseString {

  public void Reverse(String str1){

    String str="";
    for(int i=str1.length()-1; i>=0; i--){

        str=str+str1.charAt(i);
    }
    System.out.println("Reversed String:"+str);

  }
    public static void main(String args[]){
        String str1="Java";

       ReverseString rev = new ReverseString();
       rev.Reverse(str1);

      
    }
}
