import java.util.*;
public class Fibonacci_34 {
    static int fibonacci_S(int n)
    {
       if(n<=1)
       {
        return n;
       }
       else
       {
        return fibonacci_S(n-1) + fibonacci_S(n-2);
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter thwe value of n");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci_S(i)+" ");
        }

    }
}
