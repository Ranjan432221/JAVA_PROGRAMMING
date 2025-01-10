import java.util.*;
public class switchCase {
    public static void main(String args[]){
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
          age = sc.nextInt();
        switch(age){
            case 18:
            System.out.println("you are going to become an adult");
            break;
            case 23:
            System.out.println("you are going to join a job");
            break;
            case 60:
            System.out.println("you are going to get retired");
            break;
            default:
            System.out.println("Enjoy your Life");
            break;
        }
        System.out.println("thanks for read a java course");
    }
}
