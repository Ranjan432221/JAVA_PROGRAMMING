import java.util.*;
public class ra3 {
    public static void main(String args[]){
        int day;
        String name;
        System.out.println("enter any day in a week");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch(day){
            case 1:
            name = "monday";
            break;
            case 2:
            name = " tuesday";
            break;
            case 3:
            name = "wednesday" ;
            break;
            case 4:
            name= "thurshday";
            break;
            case 5:
            name = " friday";
            break;
            case 6:
            name = "saturday";
            break;
            case 7:
            name= "sunday";
            break;
            default:
            name = "invalid outtput";
            break;
        }
        System.out.println(name);
    }
}
