/*checking number is positive negative or zero */

import java.util.*;

class If_else_1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number");
         int n = sc.nextInt();

         if(n>0){
            System.out.println("This no is positive");
         }
          if(n<0){
            System.out.println("This no is negative");
        }
        if(n==0){
            System.out.println("This no is Zero");
        }
       
    }
}