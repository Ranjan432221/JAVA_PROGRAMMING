
/* ) Difference between  average of all even digits except divisible by 4 and 
avearge of all odd digits except divisble by 3 of any 4 digit  number
*/

import java.util.*;

public class Asign_1_5_c {
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

         int _1st_no = (d % 2 == 0 && d % 4 !=0) ? d : 0;
         int _2nd_no = (c % 2 == 0 && c % 4 != 0) ? c : 0;
         int _3rd_no = (b % 2 == 0 && b % 4 != 0) ? b : 0;
         int _4th_no = (a % 2 == 0 && a % 4 != 0) ? a : 0;

         int evenAverage = _1st_no + _2nd_no + _3rd_no + _4th_no;

         int _1st_no1 = (d % 2 != 0 && d % 3 !=0) ? d : 0;
         int _2nd_no2 = (c % 2 != 0 && c % 3 != 0) ? c : 0;
         int _3rd_no3 = (b % 2 != 0 && b % 3 != 0) ? b : 0;
         int _4th_no4 = (a % 2 != 0 && a % 3 != 0) ? a : 0;

         int oddAverage = _1st_no1 + _2nd_no2 + _3rd_no3 + _4th_no4;

         int evenCount = ((d % 2 == 0 && d % 4 !=0) ? 1 : 0) +
         ((c % 2 == 0 && c % 4 != 0) ? 1 : 0) + ((b % 2 == 0 && b % 4 != 0) ? 1 : 0)+
         ((a % 2 == 0 && a % 4 != 0) ? 1 : 0);

         int oddCount = ( (d % 2 != 0 && d % 3 !=0) ? 1 : 0) +
         ((c % 2 != 0 && c % 3 != 0) ? 1 : 0) + ((b % 2 != 0 && b % 3 != 0) ? 1 : 0) +
         ((a % 2 != 0 && a % 3 != 0) ? a : 0);
          

        evenCount = (evenCount == 0) ? 1 : evenCount;
        oddCount = (oddCount == 0) ? 1 : oddCount;
        evenAverage /= evenCount;
        oddAverage /= oddCount;
      

        double difference = evenAverage - oddAverage;

        System.out.println("The diffrence between of even average and odd everage = "+difference);
    }
}
