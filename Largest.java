import java.util.*;
class Largest
{
    void thirdLargest(int arr[],int arr_size)
    {
        if(arr_size<3)
        {
            System.out.println("it is a invalid");
            return;
        }
        int first = Integer.MIN_VALUE;
        for(int i=0;i<arr_size;i++)
        {
            if(arr[i]>first)
            {
                first = arr[i];
            }
        }
        System.out.println("the 1st largest no ="+first);
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr_size;i++)
        {
            if(arr[i]>second && arr[i]<first)
            {
                second = arr[i];
            }
        }
        System.out.println("the second largest no ="+second);
        int third = Integer.MIN_VALUE;
        for(int i=0;i<arr_size;i++)
        {
            if(arr[i]>third && arr[i]<second)
            {
                third = arr[i];
            }
        }
        System.out.println("the third largest no="+third);
        
    }
    public static void main(String args[])
    {
        // int arr[]= {12,14,16,13,11,10,1};
        // int n = arr.length;
        System.out.println("Enter the element which you want to prin:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[40];
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
     Largest a = new Largest();
     a.thirdLargest(arr,n);
    }
}
