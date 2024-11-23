/*find the speical digit and number and alphabate */

import java.util.*;
public class If_else_10 {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the any character and the number");
    char ch = sc.next().charAt(0);

    if(ch >= 65 && ch <= 97 || ch >= 97 && ch <= 122){
        System.out.println("This is the alphabate");
    }
    else if(ch >= 48 && ch <= 57){
        System.out.println("This is the number");
    }else{
        System.out.println("This is the special character");
    }
    
   }
}
