// Java program to demonstrate
// Arrays.copyOf() method

import java.util.Arrays;

public class Double_Dimension_6 {
    public static void main(String[] args) {

        int intArr[] = { 10, 20, 15, 22, 35 };

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(
                        Arrays.copyOf(intArr, 10)));
    }
}