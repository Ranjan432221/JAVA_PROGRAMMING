
// Java Program Demonstrating use of
// Multi Dimensional Array
import java.io.*;
import java.util.Scanner;

class Double_Dimension_3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n, m;
        n = scn.nextInt();

        int[][] arr = new int[n][];

        for (int i = 0; i < arr.length; i++) {

            m = scn.nextInt();
            arr[i] = new int[m];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {

            int odd = 0, even = 0;

            System.out.println("Rows " + i + " with " + arr[i].length + " Columns");
            System.out.println("Elements of Array:");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                // Checking Odd and even numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println();

            // Printing even and odd number
            System.out.println("Even: " + even + ", Odd: " + odd);

        }
    }
}