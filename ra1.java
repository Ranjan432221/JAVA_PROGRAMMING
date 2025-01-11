import java.util.*;
public class ra1 {
    public static void main(String args[]){
        int num;
        System.out.println("Enter any number which you want");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num>=0)
        {
            System.out.println("it is a positive number");
        }
        else
        {
            System.out.println("it ids a negative number");
        }
    }
}
