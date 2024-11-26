import java.util.Scanner;

interface printable {
    void numPrinting() throws NegativeRadiusException;
}

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "this is a neagtive number";
    }

    @Override
    public String getMessage() {
        return "noob u are ";
    }
}

class print implements printable {
    public void numPrinting() throws NegativeRadiusException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number up to print ");
        int n = sc.nextInt();
        int i = 0;
        if (n < 0) {
            throw new NegativeRadiusException();
        }
        do {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}

public class NumberPrinting_4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number");int d = sc.nextInt();
        try {

            print n1 = new print();
            n1.numPrinting();
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
    }
}
