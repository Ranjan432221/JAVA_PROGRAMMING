/* Find the value available at position required by user 
 * it may be 10, 100 or 1000?
 */

import java.util.*;

public class Asign_1_4_iii {
    public static void main(String[] args) {
        int a, b, c , d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any four digit no : ");
        int n = sc.nextInt();

        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;
        System.out.println("Here the 1 for 10 \n 2 for 100 \n 3 for 1000 \n choose your choice : ");
        
            char choice = sc.next().charAt(0);
        
      

        switch(choice){
            case '1':
            System.err.println("The result : "+b);
            break;

            case '2':
            System.out.println("The result : "+c);
            break;

            case '3':
            System.out.println("The result : "+d);
            break;
            default:
            System.out.println("its default value");
        }
  
    }
}
