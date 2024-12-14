import java.util.*;

public class str1 {
    public static void main(String[] args) {
        String re = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string which is string palindrome or not!");
        String str = sc.nextLine();

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            re = re + str.charAt(i);
        }

        if (str.equals(re)) {
            System.out.println("it is a palindrome String");
        } else {
            System.out.println("it is not palindrome String");
        }

        sc.close();

    }

}
