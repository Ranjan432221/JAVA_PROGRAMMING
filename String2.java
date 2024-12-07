import java.util.*;

public class String2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the any string in::");

       String str = sc.nextLine();
      int asciiSum = 0;
 
        for(int i =0;i<str.length();i++){
           char character = str.charAt(i);

           if(Character.isLetter(character)) {
                asciiSum += (int)character;
           }
        }

        System.out.println("the sum of asccii value of the letters is="+asciiSum);
    }
}
