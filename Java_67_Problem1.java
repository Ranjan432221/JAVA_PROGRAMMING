package problem;
import java.util.*;

class Calculator{
    public void calculator(int a, int b){
        System.out.println("your result is :"+ a+b);
    }
}

class ScCalculator{
    public void calculator(int a, int b){
        System.out.println("your result is :"+ Math.sin(a+b));
    }
}


class HyCalculator{
    public void calculator(int a, int b){
        System.out.println("your result is :"+ Math.sin(a+b));
    }
}

class Input{
    int n;
     public void Print(){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter anumber");
          n = sc.nextInt();
          System.out.println("this is the value of the number"+""+n);
     }
}





public class Java_67_Problem1 {
    public static void main(String[] args) {
        System.out.println("i am a main method");
        Input i = new Input();
        i.Print();
    }
}
