import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_Calendar_99 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
     


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      try{
        System.out.println(cal.isLeapYear(2015));
       
        try{
                
                  int f = a/b;
                  System.out.println(f);
        }catch(Exception e){
            System.out.println("this is invalid inside try");
        }
      } catch(Exception e){
        System.out.println(e.getMessage());
      }
    }
}
