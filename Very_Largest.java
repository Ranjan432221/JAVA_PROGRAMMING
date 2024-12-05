import java.util.*;

public class Very_Largest {

    void third_largest(int arr[], int arr_size){
       if(arr_size < 3){
        System.out.println("The number is invalid");
        return;
       }
      int first = Integer.MIN_VALUE;
      
      for(int i = 0; i < arr.length; i++)
      {
        if(arr[i] > first){
            first = arr[i];
        }
      }
      System.out.println("\nThe fist largest number in the array nis "+first);

      int second = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > second && arr[i]<first){
            second = arr[i];
        }
      }
      System.out.println("The second largest number is = "+second);

      int third = Integer.MIN_VALUE;
      for(int i = 0; i< arr.length; i++)
      {
        if(arr[i]> third && arr[i]<second){
            third = arr[i];
        }
      }
      System.out.println("the third largest number is = "+third);

    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(" the perfect array is ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        Very_Largest l = new Very_Largest();
        l.third_largest(arr,n);


    }
}
