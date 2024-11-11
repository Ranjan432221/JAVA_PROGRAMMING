import java.util.Scanner;

public class Four {
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number which you want to print");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==b)
        {
            System.out.println("it is a same number");
        }
        else
        {
            System.out.println("it is not a same number");
        }
    }
}
