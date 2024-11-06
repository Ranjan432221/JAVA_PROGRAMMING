
import java.util.*;

class Aarm{
    int num(int a){
        int b, armm = 0;
        int d;
        d = a;
        while(a > 0){
            b = a % 10;
             armm = (b*b*b)+armm;
             a = a/10;
        }
        if(d == armm){
            System.out.println("Armstrong");
        }else{
            System.out.println("not arm strong");
        }
        return a;
    }
}
public class Arm {
    public static void main(String[] args) {
        int r,arm = 0;
        System.out.println("Enter any number which you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c;
        c = n;

        while(n > 0){
          r = n % 10;
          arm = (r*r*r)+arm;
          n = n / 10;
        }
        if(c == arm){
            System.out.println("It is a armstrong number");
        }else{
            System.out.println("It is not a arm strong number");
        }

        Aarm m = new Aarm();
        m.num(153);

    }
}
