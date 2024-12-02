
import java.util.*;
public class Ascii_sum {
    public static void main(String[] args) {
        String str;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        str = sc.nextLine();
          byte str1[] = str.getBytes();

          for(int i = 0; i < str1.length; i++){
               System.out.println(str1[i]);

               sum += str1[i];
          }

          System.out.println("The sum of asccii value = "+sum);

    }
}
