import java.util.*;
class MyThr extends Thread{
    public String name;
    public MyThr(String name){ //this is the constructor in java
        
    //   this.name = name;
    super(name);
    }

    // public String getNa(){
    //     return name;
    // }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("i am a thread");
        }
    }
}






public class Thread_73_Constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("ranjan");
        t.start();

        /* we can know the thread id through the getId() method lets see through the eg given below  */

        System.out.println("the id of theread t is :"+ t.threadId());
        System.out.println("the name of theread t is :"+ t.getName());
        System.out.println("the Priority of theread t is :"+ t.getPriority());
    }
}
