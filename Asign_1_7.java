/* WAP to find total number of even and odd numbers avaialble in an array of user defined numbers of
 elements using command line arguments? Size of the array depends on the number of inputs. */

import java.util.*;

public class Asign_1_7 {
    public static void main(String[] args) {

        int j, even_count = 0, odd_count = 0;

        for (int i = 0; i < args.length; i++) {

            j = Integer.parseInt(args[i]);

            if (j % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }

        

        System.out.println("The count of even number in the args = "+even_count);
        System.out.println("The count of odd number in the args = "+odd_count);


    }
}
