/*Even odd program using if condition */
import java.util.*;
public class If_else_3 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any no ");
        int n = sc.nextInt();
    
        if(n % 2 == 0){
            System.out.println("This number is evevn");
        }
        if(n % 2!= 0){
            System.out.println("This number is even");
        }
    }
    
   
    
}
