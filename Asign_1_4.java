/*Sum of all digits of any 4 digit no */

import java.util.*;

public class Asign_1_4 {
    public static void main(String[] args) {

        int a,b,c,d;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the any four digit no : ");
        int n = sc.nextInt();

         a = n % 10;
         n = n / 10;
         b = n % 10;
         n = n / 10;
         c = n % 10;
         n = n / 10;
         d = n % 10;
         int sum = 0;

         sum = a + b + c + d;

         System.out.println(" The sum of the all digits of 4 digit no : "+sum);

    }
}
