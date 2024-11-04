
/*Sum of the consecutive digits of any 4 digit number?*

 * suppose num = 1234 then output = 4*3 + 3*2 + 2*1;
 */
import java.util.*;

public class Asign_1_4_iv {
    public static void main(String args[]) {

        int a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the any four digit number which you want :");
        int n = sc.nextInt();

        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;

        int Result = a * b + b * c + c * d;

        System.out.println("Output = "+ a + "*" + b + "+" + b + "*" + c + "+" + c + "*" + d);

        System.out.println("The sum of the consecutive digits : " + Result);
    }
}
