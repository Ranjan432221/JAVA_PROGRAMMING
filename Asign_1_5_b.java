
/* Sum of all odd digits of any 4 digit  number */

import java.util.*;
public class Asign_1_5_b {
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

         int _1st_no = (d % 2 != 0) ? d : 0;
         int _2nd_no = (c % 2 != 0) ? c : 0;
         int _3rd_no = (b % 2 != 0) ? b : 0;
         int _4th_no = (a % 2 != 0) ? a : 0;

         int sumOdd =_1st_no + _2nd_no + _3rd_no + _4th_no;

         System.out.println("The sum of the odd no in any 4digit no : "+sumOdd);
    }
}
