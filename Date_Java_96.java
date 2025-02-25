import java.time.LocalDate;
import java.util.Date;
import java.time.*;


public class Date_Java_96 {
    public static void main(String[] args) {

       System.out.println(System.currentTimeMillis()/1000/3600/24/365); 

    //    System.out.println(Long.MAX_VALUE);
    //    System.out.println(System.currentTimeMillis());

      Date d = new Date();
      System.out.println(d);
      System.out.println(d.getTime());
      System.out.println(d.getDate());
      System.out.println(d.getSeconds());
      System.out.println(d.getYear());
      System.out.println(d.getHours());
     

      LocalDate date = LocalDate.now();
      LocalDate yesterday = date.minusDays(1);
      LocalDate tomorrow = date.plusDays(1);

      System.out.println("Today Date"+date);
      System.out.println("yesterday:"+yesterday);
      System.out.println("tomorrow:"+tomorrow);


      LocalDate date1 = LocalDate.of(2024,8,13);
      System.out.println(date1.isLeapYear());

      LocalDate date2 = LocalDate.of(2016,9,13);
      System.out.println(date2.isLeapYear());

      LocalDate date3 = LocalDate.of(2017,1,13);

      LocalDateTime datetime = date.atTime(1,50,9);
      System.out.println(datetime);

    }
}
