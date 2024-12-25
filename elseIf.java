import java.util.*;
public class elseIf {
    public static void main(String args[]){
        int age;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>18)
        {
            System.out.println("you are experienced");
        }
        else if(age > 36){
            System.out.println("you are semi experinced");
        }
        else if (age > 50) {
            System.out.println("you are semi semi semi experinced");
        }
        else
        {
            System.out.println("you are not experinced");
        }
        if(age>2)
        {
            System.out.println("you are noot a baby");
        }
        else
        {
            System.out.println("you are a baby");
        }
    }
}
