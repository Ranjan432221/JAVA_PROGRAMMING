/*Write a program to find the volume of the duster using type-3 method social
 * 
 * type-3 method mean -> no-input  give output
 * 
 * syntax => returnType methodName(){
 * //body
 * return output;
 *  }
 */
import java.util.*;
class Box2{
    int ln, br,ht;

    int volume2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth and height of the duster");

        int ln = sc.nextInt();
        int br = sc.nextInt();
        int ht = sc.nextInt();

        int v = ln * br * ht;
        return v;
    }
}

public class Class_Box_2 {
    public static void main(String[] args) {
        Box2 d3 = new Box2();
        int v = d3.volume2();

        System.out.println("The volume of the duster is = "+v);
    }
}
