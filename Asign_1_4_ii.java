/* Fnd the the face value and position value
 * of any 4 digit number
 */

import java.util.*;

public class Asign_1_4_ii {
    public static void main(String[] args) {

        int a,b,c,d;
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the ny 4 digit number : ");
        int n = sc.nextInt();
        
        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;

        System.out.println(" The face value of the 4 digit no 1st position : "+a +"\n"+"The 1st position value : "+a*1);
        System.out.println(" The face value of the 4 digit no 2nd position : "+b +"\n"+"The 2nd position value : "+b*10);
        System.out.println(" The face value of the 4 digit no 3rd position : "+c +"\n"+"The 3rd position value : "+c*100);
        System.out.println(" The face value of the 4 digit no 4th position : "+d +"\n"+"The 4t position value : "+d*1000);

    }
}
