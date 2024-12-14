
import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int sum = 0;
        // System.out.println("Enter any string which you want ");
        // String s = sc.nextLine();

        // byte str[] = s.getBytes();
        // for(int i = 0; i < str.length; i++){
        //     System.out.println(str[i]);
           
        //     sum += str[i];

        // }
        // System.out.println("the sum of the ascii hello = "+sum);

        System.out.println("Enter the any string which you want");
        String str = sc.nextLine();
        int Asciisum = 0;

        for(int i = 0; i< str.length(); i++){
            char character = str.charAt(0);

            if(Character.isLetter(character)){
                Asciisum = Asciisum + (int)character;
            }
        }
        System.out.println("the sum of the ascii value = "+Asciisum);
    }
}
