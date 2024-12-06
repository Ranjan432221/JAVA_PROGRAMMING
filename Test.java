/*find the volume of a duster and another duster have double of 1st duster volume */

import java.util.*;

class Box {
    int ln;
    int br;
    int ht;
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box d1 = new Box();
        Box d2 = new Box();

        System.out.println("Enter the length of the duster");
        d1.ln = sc.nextInt();

        System.out.println("Enter the breadth of the duster");
        d1.br = sc.nextInt();

        System.out.println("Enter the height of the duster");
        d1.ht = sc.nextInt();

        int v1 = d1.ln * d1.br * d1.ht;
        d2.ln = 2 * d1.ln;
        d2.br = 2 * d1.br;
        d2.ht = 2 * d1.ht;

        int v2 = d2.ln * d2.br * d2.ht;

        System.out.println("The volume of the 1st duster is " + v1);

        // int v2 = 2 * v1;
        System.out.println("The volume of the 2nd duster is " + v2);

    }
}
