import java.util.*;

/*swapping of two number using the third variable in method no 2 */

public class Basic_4 {
    public static void main(String args[]) {
        System.out.println("Enter the value of a and b ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("before the swapping of number is = "+a +"and"+ b);

        int c;
        c = a + b;
        a = c - a;
        b = c - b;

        System.out.println("After the swapping the number is = "+a +"and"+ b);

        /*swapping of two number without using third variable */

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("Aftr the swapping of two number is = "+a+"and"+b);

    }
}
