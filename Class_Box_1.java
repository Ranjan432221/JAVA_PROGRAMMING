
/*write a sprogram to find the volume of the duster using type-2 method?
 * 
 * type-2 method mean =>take input give output
 * 
 * syntax -> returntype methodName(parameter){
 *   //body
 * return output;
 * }
 */
import java.util.*;

class Box1 {
    int ln, br, ht;

    int volume1(int a, int b, int c) {

        ln = a;
        br = b;
        ht = c;
        int v = ln * br * ht;
        return v;// where we see the return in any method then that method have to store in a
                 // variable in main method
    }
}

public class Class_Box_1 {
    public static void main(String[] args) {
        Box1 d1 = new Box1();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, breadth and height of the duster ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int z = d1.volume1(a, b, c);
        System.out.println("The volume of the duster = " + z);
    }
}
