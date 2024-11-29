/*Addition of the sigle dimension array */

import java.util.*;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int arr1[] = new int[5];
        int arr2[] = new int[5];

        System.out.println("input array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The first array print");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("take input of the 2nd array");
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = sc.nextInt();
        }
        System.out.println("This is the print of the 2nd array");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println("\n");
        System.out.println("€The sum of the sigle array element is ");
        for (int k = 0; k < arr2.length; k++) {
            arr2[k] = arr[k] + arr1[k];
            System.out.print(arr2[k] + " ");
        }
        sc.close();
    }
}
