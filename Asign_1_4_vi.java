
/* 
 find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit 
number?
  */

import java.util.*;

public class Asign_1_4_vi {
    public static void main(String[] args) {

        int a, b, c, d;
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 4digit number : ");
        int n = sc.nextInt();

        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;

      System.out.println("The 2nd digit no is = "+ c);
      System.out.println("The fourth digit no is = "+a);

      /*below the implimentation of the bitwise and, or  and xor */

      System.out.println("Bitwise and,or, and xor of 2nd and 4th digit of any 4digit no :  ");

      int bit_and = (c & a);
      int bit_or = (c | a);
      int bit_xor = (c ^ a);
      
      System.out.println(" The bitwise and = "+bit_and);
      System.out.println(" The bitwise or = "+bit_or);
      System.out.println(" The bitwise xor = "+bit_xor);

    }
}
