/*Find the greater number between three number using if else */

import java.util.*;
public class If_else_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("The greater value is a "+a);
        }
        else if(b > c && b > a){
            System.out.println("The greater value is b "+b);
        }else{
            System.out.println("The greater value is c "+c);
        }
    }
}
