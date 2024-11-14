
/*  Difference between Sum of product of consecutive even digits except 2 
and 6 and Sum of product of consecutive odd digits except 3 and 7  of any 4 digit number */

import java.util.Scanner;

public class Asign_1_5_f {
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
      

        int f, g, h, i;
       int _1st_no =  ((d % 2 == 0) ? d : 0);
        f = (_1st_no == 2 || _1st_no == 6) ? 0 : _1st_no;
        int _2nd_no = ((c % 2 == 0) ? c : 0);
        g = (_2nd_no == 2 || _2nd_no == 6) ? 0 : _2nd_no;
       int _3rd_no =  ((b % 2 == 0) ? b : 0);
        h = (_3rd_no == 2 || _3rd_no == 6) ? 0 : _3rd_no;
       int _4th_no =  ((a % 2 == 0) ? a : 0);
        i = (_4th_no == 2 || _4th_no == 6) ? 0 : _4th_no;

        int sumEvenResult = f*g + g*h + h*i;
        System.out.println("The sum of consecutive sum of product of even no \n except 2 and 6 = " + sumEvenResult);

        int _1st_no1 =  ((d % 2 != 0) ? d : 0);
        f = (_1st_no1 == 3 || _1st_no1 == 7) ? 0 : _1st_no1;
        int _2nd_no1 = ((c % 2 != 0) ? c : 0);
        g = (_2nd_no1 == 3 || _2nd_no1 == 7) ? 0 : _2nd_no1;
       int _3rd_no1 =  ((b % 2 != 0) ? b : 0);
        h = (_3rd_no1 == 3 || _3rd_no1 == 7) ? 0 : _3rd_no1;
       int _4th_no1 =  ((a % 2 != 0) ? a : 0);
        i = (_4th_no1 == 3 || _4th_no1 == 7) ? 0 : _4th_no1;


         int sumOddResult =  f*g + g*h + h*i;
         System.out.println("The sum of consecutive sum of product of odd no \n except 3 and 7 = " + sumOddResult);

         int diff_sumOdd_sumEven = sumEvenResult - sumOddResult;

         System.out.println(
                 "Difference between Sum of product of consecutive even digits except 2 \n and 6 and Sum of product of consecutive odd digits except 3 and 7  of any 4 digit = "+diff_sumOdd_sumEven);

    }
}
