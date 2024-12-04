
import java.util.*;

public class String_4 {
    public static void main(String[] args) {
        String str = "ranjan";
        String str1 = "RANJAN";
        System.out.println("here the upper case through string method " + str.toUpperCase());
        System.out.println("here the lower case through string method " + str1.toLowerCase());
        System.out.println(str);// no change

        /* String trim */
        /*
         * The String class trim() method eliminates white spaces before and after the
         * String.
         */

        String s = " Sachin ";
        System.out.println("without space" + s.trim());
        System.out.println("with space" + s);

        /* java string startsWith() and endsWith() method it gives true or false */

        /*
         * The method startsWith() checks whether the String starts with the letters
         * passed as arguments and endsWith() method checks whether the String ends with
         * the letters passed as arguments.
         */

        String s1 = "Ranjan";
        System.out.println(s1.startsWith("R"));// true
        System.out.println(s1.endsWith("an"));// true
        System.out.println(s1.endsWith("t"));// false

        /* java String charAt() method */
        /* The string class charAt() method returns a character at specified index */

        String s2 = "ranjan";
        System.out.println(s2.charAt(0));// r
        System.out.println(s2.charAt(4));// a

        /* java string length() method */
        /* The String class length() method returns length of the specified String. */

        String s3 = "Ranjan Kumar Sahoo";
        System.out.println("it show the how many letter in the given string " + s3.length());// 18

        /* Java String intern() method */

        String s4 = new String("Pancham");
        String s5 = s4.intern();
        System.out.println("here the same string of s4 " + s5);

        /* Java Stirng valueOf() method */

       int a = 10;
       String s6 = String.valueOf(a);
       System.out.println("it is a valueOf method "+s6+10);

        /* Java string replace() method */
        /*
         * The String class replace() method replaces all occurrence of first sequence
         * of character with second sequence of character.
         */

         String s7 = "It is a java replace method in java string";
         System.out.println(s7.replace("is","are"));

    }
}
