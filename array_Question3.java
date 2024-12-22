import java.util.*;
public class array_Question3 {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int [] a = new int[6];
        // int max =0;
        // System.out.print("enter the array below ");
        // for(int i=0;i<4;i++)
        // {
        //     a[i] = sc.nextInt();
        // }
        // System.out.println("perfection of array");
        // for(int i=0;i<4;i++)
        // {
        //     if(max<a[i])
        //     {
        //         max = a[i];
        //         System.out.print(a[i]+" ");
        //         System.out.print("");
        //     }
        // }
        // System.out.println("max="+max);
            

        //PROBLEM 7


        int []b={2,34,56,678};
        int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        System.out.println("below the minimum value in array");
       for(int i=0;i<b.length;i++)
       {
        if(min>b[i])
        {
            min= b[i];
            System.out.print(b[i]+" ");
            System.out.print("");
        }
       }
    //    System.out.println(min);
    //    System.out.println(Integer.MIN_VALUE);
    //    System.out.println(Integer.MAX_VALUE);
    }
}
