/*Show result according to percent using if statement */

import java.util.Scanner;

public class If_else_2 {
    public static void main(String[] args) {

        char g = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mark");
        int n = sc.nextInt();

        if (n >= 30 && n <= 60) {
            g = 'c';
        }
        if (n >= 60 && n <= 80) {
            g = 'b';
        }
        if (n >= 80 && n <= 100) {
            g = 'a';
        }

        System.out.println("The  Grade of the student as per there percentage of marks = " + g);
    }
}
