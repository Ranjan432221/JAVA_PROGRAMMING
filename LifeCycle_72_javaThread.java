/*Thread method use in the extends (mean inherit type) and running for use here the start() method in main function
 * 
 * But the Runnable interface use in the implrements through and it is also running or accessing in main class through start() method b
 * before start() method we have to create the Thread object and pass Runnable object in thread 
 * 
 * eg ->Mythread t1 = new Mythread();
 * t1.start();-->this is not accessible 
 * 
 * eg) MyThread g  = new MyThread();
 * Thread t = new Thread(g);
 * t.start(); --> this is accessible
 * 
 */




public class LifeCycle_72_javaThread {
    public static void main(String[] args) {
        
    }
}
