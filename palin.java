import java.util.*;
public class palin {
    public static void main(String[] args) {
        System.out.println("enter any number ");
        Scanner sc = new Scanner(System.in);
        int n,b,s=0,c;
        n = sc.nextInt();
        c = n;
        while(n>0)
        {
            b = n%10;
            s = s*10+b;
            n = n/10;
        }
        if(c == s )
        {
           System.out.println("palindrome");
        }
        else
        {
            System.out.println("it is not an palinjdfrome");
        }
    }
}
