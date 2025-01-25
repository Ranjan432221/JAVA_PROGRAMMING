/*here we  are discussing about the interface through the example briefly */

import java.util.*;

interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("this is an private greet method in Mycamera Interface");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetwork();
     void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
            System.out.println("calling"+phoneNumber);
    }

    void pickCall(){
        System.out.println("connecting..");
    }
    
}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{


    public void takeSnap(){
        System.out.println("Taking snap");
    }

    public void recordVideo(){
        System.out.println("this is a n record video implemented");
    }

    public String[] getNetwork(){
        System.out.println("getting list of network");
        String[] networkList = {"ranjan","rahul","ravi"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("connecting to network"+network);
    }
}

public class Interface_57_implemen {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
       String[] ar = ms.getNetwork();
       for(String item:ar){
        System.out.println(item);
       } 
       
    }
}
