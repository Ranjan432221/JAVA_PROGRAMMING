/*Check charcater vowel or consonant */
import java.util.*;

public class If_else_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character which you want to print");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
          System.out.println("It is a vowel ");
        }else{
            System.out.println("It is a consonant");
        }
    }
}
