/*Aalphabet upper case and lower case */

import java.util.*;
public class If_else_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 90){
            System.out.println("These character are in upper cass");
        }else{
            System.out.println("These are lower case");
        }
    }
}
