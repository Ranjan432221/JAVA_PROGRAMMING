import java.util.*;
/*here the swapping of the number using the third variable */

public class Base_3 {
    public static void main(String... args) {
        int c;
        System.out.println("enter the value of a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the val;ue of the b");
        int b = sc.nextInt();

        System.out.println("Before swapping the value is = "+a + "and" +b);

        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping the value of a and b is = " +a+ "and" +b);

    }
}
