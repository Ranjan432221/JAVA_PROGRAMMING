import java.util.*;
public class Array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 dimensional array");
        int []arr= new int[5];
        int i;
        System.out.println("enter the elements");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("now below the array");
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
