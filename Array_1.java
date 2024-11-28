/*print array in java */

import java.util.*;
public class Array_1 {
    public static void main(String args[]){
         int[] arr = new int[23];
         Scanner sc = new Scanner(System.in);
         System.out.println("here Input the code in array");
        for(int i = 0;i <= 10; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Below the proper code of array");
        for(int i = 0; i<= 10; i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
