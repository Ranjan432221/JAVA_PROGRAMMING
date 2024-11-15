import java.util.*;
 class Box4{
    int ln,br,ht;

    Box4(){  // create non parameterized constructor
        ln = 5;
        br = 6;
        ht = 7;
    }

    Box4(int a, int b, int c){  // create paramaterized constructor
        ln = a; br = b; ht = c;
    }

    void volume(){
        int v = ln * br * ht;
        System.out.println("The volume of the box is = "+v);
    }
 }

public class Class_Constructor_1 {
    public static void main(String[] args) {
        int a, b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ln, br , ht of the box ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Box4 d5 = new Box4(a,b,c);//calling the parameterized constructor
        d5.volume();

         Box4 d6 = new Box4();//calling the non parameterized constructor
         d6.volume();
    }
}
