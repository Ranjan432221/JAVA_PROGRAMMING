
/*. Write a java program to find sum and carry of any 2 numbers following 
approach and bitwise operator ?

 b) Full Adder Circuit
*/

import java.util.*;
public class Asign_1_6_b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int A = sc.nextInt();

        System.out.println("Enter the value of b ");
        int B = sc.nextInt();
        
        System.out.println("Enter the value of Cin : ");
        int Cin = sc.nextInt();

        int sum = A ^ B ^ Cin;   // XOR for sum
        int carry = (A & B) | (B & Cin) | (A & Cin); // AND and OR for carry

        System.out.println("Full Adder:");
        System.out.println("Sum: " + sum);
        System.out.println("Carry: " + carry);

    }
}
