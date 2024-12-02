import java.util.*;

public class Average {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        float evenAverage, oddAverage, primeAverage;
        int evenSum = 0, oddSum = 0, primeSum = 0;
        int evenCount = 0, oddCount = 0, primeCount = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            // Check if number is even
            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            }
            // If number is odd
            else {
                oddSum += num;
                oddCount++;
            }

            // Check if number is prime
            if (isPrime(num)) {
                primeSum += num;
                primeCount++;
            }
        }

        // Calculate averages with checks to avoid division by zero
        evenAverage = (evenCount > 0) ? (float) evenSum / evenCount : 0;
        oddAverage = (oddCount > 0) ? (float) oddSum / oddCount : 0;
        primeAverage = (primeCount > 0) ? (float) primeSum / primeCount : 0;

        System.out.println("Even numbers average = " + evenAverage);
        System.out.println("Odd numbers average = " + oddAverage);
        System.out.println("Prime numbers average = " + primeAverage);
    }
}
