import java.util.*;
public class Arr{
    public static void main(String args[]){
        int n;
        System.out.println("Enter size of array=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("below the array size");
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the perfect array=");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}