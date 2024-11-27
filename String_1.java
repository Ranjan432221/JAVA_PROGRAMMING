/*String intro with some basic code */
import java.util.*;
public class String_1 {
    public static void main(String[] args) {
        
        String s1 = "java";//creating a string by java string literal

        char ch[] = {'r','a','n','j','a','n'};

        String s2 = new String("example");//creating java string by new key word
        String s3 = new String(ch);//converting char array to string

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s = "sachin";
       s = s.concat("tendulkar");
       System.out.println(s);//here only print the sachin beacause strings are immutable


       /*There are three way to compare a string in java
        * 1) By using equals() method
        2)   By using == operator
        3) By using compareTo() method
        */

        //start one by one all method i)equals()

        String t1 = "chandan";
        String t2 = "chandan";
        String t3 = new String("chandan");

        String t4 = "charuvi";

        System.out.println(t1.equals(t2));//true
        System.out.println(t1.equals(t3));//true
        System.out.println(t1.equals(t4));//false


        //here discuss about equalsIgnoreCase()

        String r1 = "ambi";
        String r2 = "AMBI";

        System.out.println(r1.equals(r2));//false
        System.out.println(r1.equalsIgnoreCase(r2));//true
        /*equalsignoreCase() method also use for comparision but its ignore the lower and upper case
         * if the letters are same then its give the true ans
         */
          
         
    }
}
