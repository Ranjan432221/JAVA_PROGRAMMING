import java.util.*;
public class Asign_1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal Amt : ");
        int p = sc.nextInt();

        System.out.println("Enter the time period : ");
        int t = sc.nextInt();

        System.out.println("Enter the rate of interest : ");
        int r = sc.nextInt();

        double SI = p * t * r / 100;

        System.out.println("The simple interest = " +SI);

      sc.close();
        
    }
}
