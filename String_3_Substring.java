
import java.util.*;
public class String_3_Substring {
    public static void main(String[] args) {
        /*
         * discus about the substring(startindex,endIndex)
         * startIndex ->inclusive
         * endIndex -> exclusive
         */

        String s = "Sachin Tendulkar";
        System.out.println("Original string: " + s);
        System.out.println("Substring starting index 6: " + s.substring(6));
        System.out.println("Substring start from index 0 to 6: " + s.substring(0, 6));

        /* using string split() method */
        /*
         * The split() method of String class can be used to extract a substring from a
         * sentence. It accepts arguments in the form of a regular expression.
         */

        //  String text = new  String("Hello My name is Ranjan");

        //  String sentence[] = text.split("\\");
        //  System.out.println(Arrays.toString(sentence));

         String myString = "Split a string by spaces, and also punctuation";
         String regex = "[,\\.\\s]";

         String[] myArray = myString.split(regex); 

        for(String t :myArray){
           System.out.println(t);
        }

    }
}
