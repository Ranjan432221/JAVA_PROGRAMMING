import java.util.*;

// Approach - 1
public class Str_Reverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string");
    String str = sc.nextLine();

    for(int i = str.length()-1; i >= 0; i--) {
        System.out.print(str.charAt(i));
    }

    // Approach - 2

    char[] chArr = str.toCharArray();
    for(int i = chArr.length - 1; i >= 0; i--) {
        System.out.print(chArr[i]);
    }
    System.out.println();

    //Aproach - 3
    StringBuffer sb = new StringBuffer(str);
    System.out.println(sb.reverse()); 

   // Approach -4

   StringBuilder builder = new StringBuilder(str);
   System.out.println(builder.reverse());
   
   }
}
