import java.util.*;
public class Is_Prime {

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int a = sc.nextInt();

        System.out.println("this number is prime = "+isPrime(a));
    }
}
