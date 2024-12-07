/*String buffer */
import java.util.*;
public class str2 {
    public static void main(String[] args) {

      /*  String str1 = "Ranjan";
        //StringBuffer str = new StringBuffer(str1);
        StringBuilder str = new StringBuilder(str1);
        str = str.reverse();
        str1 = str.toString();
        System.out.println(str1);

        //System.out.println(str.reverse());
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();

        for(int i = str.length() - 1 ; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
