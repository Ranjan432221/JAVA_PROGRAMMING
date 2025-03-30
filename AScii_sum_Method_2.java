import java.util.*;
public class AScii_sum_Method_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        int sum = 0;

        byte []str1 = str.getBytes();
        for(int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);

            sum += str1[i];
        }
        System.out.println(" the sum of the ascii is = "+ sum);
    }
}
