import java.util.*;
public class chpt_4Question_4 {
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no of week");
        no = sc.nextInt();
        switch(no){
            case 1:
           System.out.println("sunday");
           break;
           case 2:                     
           System.out.println("monday");
           break;
           case 3:
           System.out.println("tuesday");
           break;
           case 4:
           System.out.println("wednesday");
           break;
           case 5:
           System.out.println("thurshday");
           break;
           case 6:
           System.out.println("friday");
           break;
           case 7:
           System.out.println("saturday");
           break;
           default:
           System.out.println("it is not any day");
        }
    }
}
