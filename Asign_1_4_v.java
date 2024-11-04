
/*find the sum of product of corresponding digits of two
 * any 4 digit number such as n = 1234; m = 7896; output=6*4 + 9*3 + 8*2 +7*1
 * 
  */

import java.util.*;

public class Asign_1_4_v {
    public static void main(String[] args) {

        int a1,b1,c1,d1;
       
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st 4digit number which you want to print : ");
        int n1 = sc.nextInt();

         a1 = n1 % 10;
         n1 = n1 /10;
         b1 = n1 % 10;
         n1 = n1 / 10;
         c1 = n1 % 10;
         n1 = n1 / 10;
         d1 = n1 % 10;

         System.out.println("n = "+a1+""+b1+""+c1+""+d1);

         int a2,b2,c2,d2;

         System.out.println("Enter the 2nd 4digit number : ");
         int n2 = sc.nextInt();
         
         a2 = n2 % 10;
         n2 = n2 /10;
         b2 = n2 % 10;
         n2 = n2 / 10;
         c2 = n2 % 10;
         n2 = n2 / 10;
         d2 = n2 % 10;

         System.out.println("n = "+a2+""+b2+""+c2+""+d2);

         System.out.println("Output = "+a1 +"*" +a2 +"+"+ b1 +"*" +b2 +"+" +c1 +"*" +c2 + "+" +d1 +"*"+ d2);

         int Result = a1 * a2 + b1 * b2 + c1 * c2 + d1 * d2;

         System.out.println("The sum of product of corresponding digits : "+Result);


            sc.close();
    }
}
