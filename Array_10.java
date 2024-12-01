/*search the sigle array element position in the array */

import java.util.*;
public class Array_10 {
    public static void main(String[] args) {
   Scanner sc  =new Scanner(System.in);
        int r, m= 0;
        int roll[] = {1,3,43,23,65,41,12,13,67,98,87,67};

        for(int i = 0; i<roll.length; i++){
            System.out.print(roll[i]+" ");
        }

        System.out.println("\nEnter any roll no ");
        r = sc.nextInt();

       for(int j = 0; j < roll.length; j++){
        if(r == roll[j]){
             System.out.println("roll no is found at position "+ j);
             m=1;
        }
       }
       if(m==0){
        System.out.println("the roll no is not found");
       }
    }
}
