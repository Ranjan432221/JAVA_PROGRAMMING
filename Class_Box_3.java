/*Write a program to find the volume of the duster using type-4 method 
 * 
 * type-4 method mean -> no-input no-output
 * 
 * syntax => void methodName(){
 * //body
 *   }
 */
import java.util.*;

class Box3{
    int ln, br, ht;

    void volume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the ln,br, ht of the Duster");
         ln = sc.nextInt();
         br = sc.nextInt();
         ht = sc.nextInt();

         int v = ln * br *ht;
         System.out.println("The volume of the duster is = "+v);
         
         sc.close();
    }
    
}

public class Class_Box_3 {
    final public static void main(String args[]){
       Box3 d4 = new Box3();
       d4.volume();
    }

    
}
