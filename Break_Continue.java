import java.util.*;
//Break and Continue using loops!
public class Break_Continue {
    public static void main(String args[]){
      // for(int i=0;i<=5;i++){
      //   System.out.println(i);
      //   System.out.println("Java is great");
      //   if(i==2){
      //     System.out.println("ending the loop");
      //     break;
      //   }
      // }  
      int i = 0;
      while(i<=6){
        if(i==3){
          i++;
             // break;
            // System.out.println("ending the loop");
             continue;
        }
         
        System.out.println(i);
        i++;
        System.out.println("java is great");
      }
      
    }
}
