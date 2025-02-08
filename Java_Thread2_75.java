
/*
 * Interrupt() method :
A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
The interrupt() method throws InterruptedException.
The interrupt() method will not throw the InterruptedException if the thread is not in the sleeping/blocked state, but the interrupt flag will be changed to true.

Syntax :
Public void interrupt()
 */



/*Example of Interrupted */

import java.util.*;
import java.lang.Thread;
class ran extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread");/* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */
                Thread.sleep(4000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread is Interrupted");
        }
        System.out.println("Thread is running");
    }
    /*
     * if we call this class in main function then OUTPUT IS
     * it is main thread
      Child Thread
      Child Thread is Interrupted
      Thread is running
     */
}

class ran1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    /* if we call this class in main function then OUTPUT IS
     * 
     * main thread
     0
     1
     2
     3
     4
     5
     6
     7
     8
     9
    */
}

public class Java_Thread2_75 {
    public static void main(String[] args) {
        ran t = new ran();
        t.start();
        t.interrupt();
        System.out.println("it is main thread");



        ran1 t1 = new ran1();
        t1.start();
        t1.interrupt();
        System.out.println("main thread");
    }
}
