import java.util.*;

class New {
    int numPalin(int a) {
        int b, s = 0, c;
        c = a;
        while (a > 0) {
            b = a % 10;
            s = s * 10 + b;
            a = a / 10;
        }

        if (c == s) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }
        return a;

    }

    String stringPalin(String n) {
        String re = "";
        int length = n.length();
        for (int i = length - 1; i >= 0; i--) {
            re = re + n.charAt(i);
        }
        if (n.equals(re)) {
            System.out.println("string is palindrome ");
        } else {
            System.out.println("String is not palindrome");
        }
        return n;
    }

    int aarm(int b) {

        int armStrong = 0, d, r;
        d = b;

        while (b > 0) {
            r = b % 10;
            armStrong = (r * r * r) + armStrong;
            b = b / 10;
        }
        if (d == armStrong) {
            System.out.println("It is A armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
        return b;
    }

    void AsciSum(){
        int sum = 0;
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s = sc.nextLine();

        byte s1[] = s.getBytes();
        for(int i = 0; i < s1.length; i++){
            System.out.println(s1[i]);

            sum += s1[i];
        }
        System.out.println("tyhe sum of the string = "+sum);
    }
}

public class Extra {
    public static void main(String args[]) {
        New n =  new New();
        n.numPalin(121);
        n.stringPalin("wow");
        n.aarm(153);
        n.AsciSum();
    }
}
