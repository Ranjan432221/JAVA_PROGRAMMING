import java.util.*;
public class chapter_4 {
    public static void main(String args[]){
    //     int a = 10;
    //     if(a==11)
    //     {
    //   System.out.println("ypu are in 11 age");
    //     }
    //     else
    //     {
    //         System.out.println("you are not 11 years old");
    //     }
    //question 2
    int m1, m2,m3;
    Scanner sc = new Scanner(System.in);
         System.out.println("enter your marks in physics");
         m1 = sc.nextByte();
         System.out.println("enter your marks in chemistry");
         m2 = sc.nextByte();
         System.out.println("enter your amrks in mathematics");         
         m3 = sc.nextByte();
         float avg = (m1+ m2+m3)/3.0f;
         System.out.println("over all percentage is="+ avg);
         if(avg>=40 && m1 >= 33 && m2>= 33 && m3>33){
            System.out.println("congratulation you have been promoted");

         }
         else
         {
            System.out.println("sorry you have not been promoted");
         }
    }
}
