import java.util.*;
public class Chpt_4Question_6 {
    public static void main(String args[]){
        int year;
        System.out.println("Enter any year which you want to print");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year % 4==0 && year % 100!=0  || year % 400==0){
            System.out.println("it is a leap year" +year);
        }
        else
        {
          System.out.println("it is not a leap year" +year);
        }
    }
}
