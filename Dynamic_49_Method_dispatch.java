//here we are discussing the Dynamic Method Dispatch

import java.util.*;
class Phone{
    public void showTime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turining on phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing the music");
    }

    public void on(){
        System.out.println("Turining on SmartPhone..");
    }
}


public class Dynamic_49_Method_dispatch {
    public static void main(String[] args) {
        
        // Phone obj = new Phone();//-->Allowed

        Phone obj = new SmartPhone();//Yes it is Allowed\

        // SmartPhone obj = new Phone();//-->THis is not allow

        obj.on(); //->its gives a output of SmartPhone class method on which is "turning on SmartPhone"
        //but not run the super class phone on ,because it has both class same method name "on"
        obj.showTime();//it gives the super class metod ShowTime as a output

        SmartPhone s = new SmartPhone();
        s.music();
    
    }
}
