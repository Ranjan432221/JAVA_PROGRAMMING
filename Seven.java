import java.util.*;
public class Seven{
    public static void main(String[]args)

    {
       int n,i;
       System.out.println("enter thr range in reversw order:");
       final Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(i=10;i>n;i--)
       {
        System.out.println(i);
       }
    }
}
 