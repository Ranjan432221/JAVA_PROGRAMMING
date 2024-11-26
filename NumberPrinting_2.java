/*number printng using while loop */
import java.util.*;

public class NumberPrinting_2 {
    public void numPrinting(){
        int j = 0;

        do{
            if(j == 8){
                j++;
               continue;
            }
            System.out.print(j+" ");
            j++;
        }while(j <= 20);
    }
 

    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
           if(i == 7){
            i++;
             continue;
           }
           System.out.print(i+" ");
           i++;
        }
        System.out.println("\n");

        NumberPrinting_2 n1 = new NumberPrinting_2();
         n1.numPrinting();
    }
}
