import java.util.*;
import java.lang.Thread;

class MyNewThr1 extends Thread{
     public void run(){
        int i =0;

        // System.out.println(" iam a main thread");
        while(true){
            System.out.println("i am a thread");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
     }
}
 class MyNewThr2 extends Thread{
    public void run(){
        
        while(true){
      // System.out.println("i am thread");
         System.out.println("thank you");
        }
    }
 }


public class Java_Thread3_75 {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // try{
        //     t1.join();--> it is use for first complete of running first func mean t1.start then run t2.start
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
      

        t2.start();
    }
}
