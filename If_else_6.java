
/*Log in page */
import java.util.*;

public class If_else_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName = "Ranjan";
        String passWord = "Sahoo";
        String u = "";
        String p = "";

        boolean i = true;

        do {

            System.out.println("Enter the user name");
            u = sc.next();

            System.out.println("Enter the password");
            p = sc.next();

            if (userName.equals(u) && passWord.equals(p)) {
                System.out.println("open succesfully");
                i = false;
            } else {
                System.out.println("Invalid password\n sign in again");
            }
        } while (i);

        sc.close();

    }
}
