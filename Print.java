import java.util.*;

class PrintPalindrome {
    int Palin(int a) {

        // System.out.println("Enter any number ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        int c, b, s = 0;

        c = a;

        while (a > 0) {
            b = a % 10;
            s = s * 10 + b;
            a = a / 10;
        }

        if (c == s) {
            System.out.println("It is a palinDrome number");
        } else {
            System.out.println("It is not an palin drome number ");
        }
        return a;

    }

    String Palin(String a) {
        Scanner sc = new Scanner(System.in);
        String re = "";
        int length = a.length();

        for (int i = length - 1; i >= 0; i--) {
            re = re + a.charAt(i);
        }
        
        if (a.equals(re)) {
            System.out.println("it is a palidn drome string");
        } else {
            System.out.println("it is not  an palidrome string");
        }
        return a;
    }

}

public class Print {
    public static void main(String[] args) {
        PrintPalindrome p = new PrintPalindrome();
        p.Palin(456);
        p.Palin("wow");
    }
}
