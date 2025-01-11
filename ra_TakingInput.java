import java.util.*;
public class ra_TakingInput {
    public static void main(String args[]){
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
       // int a = sc.nextInt();
       float a = sc.nextFloat();
        System.out.println("enter nuber 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b;
       float sum = a + b;
        System.out.println("the sum="+sum);
        //boolean b1 = sc.hasNextInt();=>it is used to take input value of "boolean datatype"
        //String str = sc.next();//=>it takes input of string only take a word
        String str = sc.nextLine();//=>it takes full sentence in string
        System.out.println(str);
    }
}
