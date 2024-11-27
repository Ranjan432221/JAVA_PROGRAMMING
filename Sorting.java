
/*here sorting array without using the sort() method in java */

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Below give the input of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Below the array perfectly ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Below the sorting of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print(arr[i] + " ");

        }
    }
}
