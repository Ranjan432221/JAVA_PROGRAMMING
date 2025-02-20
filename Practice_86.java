import java.util.Scanner;

public class Practice_86 {
    public static void main(String[] args) {
        //problem 1
        
       //Sysntax Error -> int a = 5
       int age = 78;
       int year_born = 2000-78; /*this is a logical error */

    //    System.out.println(6/0);


       //problem 2

       try{
        int a  = 666/0;
       }
       catch(IllegalArgumentException e){
        System.out.println("hehe");
       }
       catch(ArithmeticException e){
        System.out.println("Haha");
       }

       // problem 3

       boolean flag = true;
       int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 7;
        marks[2] = 45;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
       while(flag && i < 5){
        try{
        System.out.println("enter the valid index of the marks");
         index = sc.nextInt();
         System.out.println("the value of marks index ="+marks[index]);
          break;
        }
        catch(Exception e){
            System.out.println("Invalid index");
            i++;
        }
            

       }
       if(i>=5){
        System.out.println("Error");
       }

    }
}
