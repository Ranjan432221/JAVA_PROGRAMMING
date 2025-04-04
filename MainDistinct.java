// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MainDistinct {
    
   public static void main(String args[]) {
      int []arr = {1,1,2,2,3,3,4,4,5,5,5,6,6,7,8};
    System.out.print(arr[0]+" ");
      
  
      for(int k = 1; k < arr.length; k++) {
          if(arr[k] != arr[k-1]) {
             System.out.print(arr[k]+" ");
          }
         
      }
      
   }
}