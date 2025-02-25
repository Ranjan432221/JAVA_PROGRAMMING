/*Calendar class is a Abstract class
 * within a calendar have a Instance class
 */

import java.util.Calendar;
import java.util.TimeZone;

public class Calander_class_98 {
    public static void main(String[] args) {

        
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapur"));

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());

    }
}
