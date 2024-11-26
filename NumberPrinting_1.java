/*it is a simple number printing 0 to n  and skip any number between runnig using do while*/
import java.util.*;
public class NumberPrinting_1 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter number which up to print");
       int n = sc.nextInt();

       int i = 0;
       do{
                if(i == 5){
                    i++;
                    continue;
            
                }
                
                System.out.print(i+" ");
                i++;
                break;
        
       }while(i <= n);
    }
}
