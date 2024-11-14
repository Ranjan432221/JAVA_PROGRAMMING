
/* ) Write a java program to find sum of product of corresponding even digits of 

 first any digit number and corresponding odd digit of any 4 digit number Such as 
n=1234 m=4567 output=4*7+2*5 
*/

import java.util.*;
public class Asign_1_5_g {
   public static void main(String[] args) {
    
      int a, b, c, d;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter any 4digit number n : ");
      int n = sc.nextInt();

      System.out.println("Enter any 4digit number m : ");
      int m = sc.nextInt();

      a = n % 10;
      n = n / 10;
      b = n % 10;
      n = n / 10;
      c = n % 10;
      n = n / 10;
      d = n % 10;
    
      int _1st_no = (d % 2 == 0) ? d : 0;
      int _2nd_no = (c % 2 == 0) ? c : 0;
      int _3rd_no = (b % 2 == 0) ? b : 0;
      int _4th_no = (a % 2 == 0) ? a : 0;

      int f, g, h, i;

      f = m % 10;
      m = m / 10;
      g = m % 10;
      m = m / 10;
      h = m % 10;
      m = m / 10;
      i = n % 10;

      int _1st_no1 = (i % 2 != 0) ? i : 0;
      int _2nd_no1 = (h % 2 != 0) ? h : 0;
      int _3rd_no1 = (g % 2 != 0) ? g : 0;
      int _4th_no1 = (f % 2 != 0) ? f : 0;

      int FinalResult = _1st_no * _1st_no1 + _2nd_no*_2nd_no1 + _3rd_no*_3rd_no1 + _4th_no*_4th_no1;

      // System.out.println("the final result = "+FinalResult);

      System.out.println(_1st_no +"*"+_1st_no1 +"+"+_2nd_no+"*"+_2nd_no1 +"+"+_3rd_no+"*"+_3rd_no1 +"+"+ _4th_no+"*"+_4th_no1+" = "+FinalResult);




   } 
}
