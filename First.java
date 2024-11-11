import java.util.*;  //contains collection of input methods 
public class First{
    public static void main(String[]args){
        int a,b,c;    //used to store the value;//
        System.out.println("enter the number");
        //scanner =>used to access input value//
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c =a+b;
        System.out.println("value is:"+c);
    }
}