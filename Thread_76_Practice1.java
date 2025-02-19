import java.util.*;
import java.lang.Thread;

class Practice extends Thread{
    public void run(){
         

        // while(true)
        for(int i=0;i<20;i++){
           
            // try{
                
            //     Thread.sleep(4000);
            // }
            // catch(InterruptedException e){
            //     System.out.println(e);
            // }
            System.out.println("Good morning");
        }
    }
  
}

class Practice1 extends Thread{
   public void run(){
    // while(true)
    for(int i=0;i<20;i++)
    {
        // try{
            
        //     Thread.sleep(4000);
        // }
        // catch(Exception e){
        //  System.out.println(e);
        // }
         System.out.println("Welcome");
    }
   }
}


public class Thread_76_Practice1 {
    public static void main(String[] args) {

        Practice t  = new Practice();
        Practice1 t1 = new Practice1();
        t.setPriority(6);
        t1.setPriority(9);

        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());//it show new
        t.start();
       
        // try{
        //     t.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        t1.start();
        System.out.println(t1.getState());// it show RUNNABLE
        System.out.println(Thread.currentThread().getState());// here make a reference of the thread take a Thread.currentThread() method 
        
    }
}
