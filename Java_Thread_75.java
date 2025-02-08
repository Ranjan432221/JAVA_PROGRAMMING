

/*join() Method
 * 
 * The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.
If t is a Thread object whose thread is currently executing, then t.join() causes the current thread to pause execution until t's thread terminates.
Join() method puts the current thread on wait until the thread on which it is called is dead.


syntax-> public final void join()


You can also specify the time for which you need to wait for the execution of a particular thread by using the Join() method.
Syntax :public final void join(long millis)
 */

 /*Sleep() method
  * 

The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
Sleep() method returns void.
sleep() method can be used for any thread, including the main() thread also.



Syntax :
public static void sleep(long milliseconds)throws InterruptedException
public static void sleep(long milliseconds, int nanos)throws InterruptedException


Parameters Passed To Sleep() Method :
long millisecond: Time in milliseconds for which thread will sleep.
nanos : Ranges from [0,999999]. Additional time in nanoseconds.

  */
  /*Example  Given below*/

  import java.util.*;
  import java.lang.Thread;
  public class Java_Thread_75
  {
    public static void main(String[] args) {
      try{
        for(int i=0;i<=5;i++)
        {
          Thread.sleep(2000);
          System.out.println(i);
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }


    