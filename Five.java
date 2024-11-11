import java.util.*;
public class Five{
   public static void main(String[]args){
    int n,f =1;
    System.out.println("enter any no which you want to print");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while(n>0)
   {
    f = f*n;
    n = n-1;
   }
   System.out.println("The factorial of a number is=");
   System.out.println(f);
 }
}
