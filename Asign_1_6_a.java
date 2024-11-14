
/* Write a java program to find sum and carry of any 2 numbers following 
approach and bitwise operator ?
 a) Half Adder Circuit */

 /*SUM: sum = A + B(XOR operation)
  * CARRY : carry =  A & B(AND operation)
  */

import java.util.*;
public class Asign_1_6_a {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int A = sc.nextInt();

        System.out.println("Enter the value of b ");
        int B = sc.nextInt();

        int sum = A ^ B;
        int carry = A & B;

        System.out.println("Half adder sum : "+sum);
        System.out.println("Half adder carry : "+carry);



    }
}
