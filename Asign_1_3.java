/*Write a java program to find the greatest no among three numbers */

import java.util.Scanner;

public class Asign_1_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no a :");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd no of b : ");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd no : ");
        int c = sc.nextInt();

        int Greatest_no = (a > b) ? ((a>c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greatest no between three no : " +Greatest_no);
    }
}
