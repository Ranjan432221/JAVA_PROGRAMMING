/*copy the array element one array tro another */
import java.util.*;
public class Array_11 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("take input of the array");
        for(int i = 0; i< a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is complete before the copy");
        for(int i= 0; i< a.length; i++)
        {
            System.out.print(a[i]+" ");
            b[i] = a[i];
        }
       System.out.println("\nAfter the copy of the element ");
       for(int j = 0; j < a.length; j++)
       {
          System.out.print(a[j]+" ");
       }
    }
}
