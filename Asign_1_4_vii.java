/* Find left shit, right shift and zero fill of summation of all digits of any 
4 digit number and it will be shifted by 3rd digit of any 4 digit number */
import java.util.*;
public class Asign_1_4_vii {
    public static void main(String[] args) {
         int a, b, c,d;

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

         int summation =  a + b + c + d;

         int leftShift = (summation<<c);
         int Right_shift = (summation>>c);

         System.out.println("The left shift  : "+leftShift);
         System.out.println("The Right shift : "+Right_shift);
         System.out.println("Sum of all digit no : "+summation);
    }
}
