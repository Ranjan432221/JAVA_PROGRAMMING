import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.Calendar;

public class Practice_102_Set {
    public static void main(String[] args) {
        //PS q1

        ArrayList<String> list= new ArrayList<String>();

        list.add("rahul");
        list.add("rahul1");
        list.add("rahul2");
        list.add("rahul3");
        list.add("rahul4");
        list.add("rahul5");
        list.add("rahul6");
        list.add("rahul7");
        list.add("rahul8");
        list.add("rahul9");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //PS Q2

        HashSet<Integer> s = new HashSet<>();
        
        s.add(3);
        s.add(3);
        s.add(5);
        s.add(6);
        s.add(6);

        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //PS Q3 
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds());

      //PS Q4

        LocalDateTime df1 = LocalDateTime.now();
      
     DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyy -- E H:m a");

     String MyDate = df1.format(df);
     System.out.println(MyDate);

         //PS Q5

     Calendar c = Calendar.getInstance();
     System.out.println("this is getTime::"+c.getTime());
     System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
