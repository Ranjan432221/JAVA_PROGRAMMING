//*find the minimum value in the single array */
import java.util.*;
public class Array_9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("take input in the array");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array of the sigle array is ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("\nthe minimum value of the sigle array is "+min);
    }
}
