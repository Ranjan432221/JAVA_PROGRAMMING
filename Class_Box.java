/*write a program to find the volume of the duster using method and type-1 selfish

 * type-1 mean take input and no output
 * 
 * syntax -> void methodName(parameter){
 *   //body
 * }
 */
import java.util.*;

class Box{
    int ln,br,ht;

    void volume(int a, int b, int c){
        ln = a; br = b; ht = c;

        int v = ln * br * ht;
        System.out.println("The volume of the duster = "+v);
    }
}
public class Class_Box {
    public static void main(String[] args) {
        Box d = new Box();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length, breadth and height of the duster");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        d.volume(a,b,c);

    }

}
