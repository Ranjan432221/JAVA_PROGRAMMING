import java.util.*;

public class t {
    public static void main(String[]args){
        int n,f = 1;
        System.out.println("enter any number which you want:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            f = f*n;
            n = n-1;
        }
        System.out.println(f);
    }
}
