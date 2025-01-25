/*here discus abut the imnheritance in interface */
/*when interface to interface derive that time we use the extends and use interface instead of class */
/*when interface to class derive that time we have to use the implements */

import java.util.*;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void  meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("this is a meth 1");
    }

    public void meth2(){
        System.out.println("this is a meth 2 ");
    }
    public void meth3(){
        System.out.println("this is the meth 3");
    }

    public void meth4()
    {
        System.out.println("this is a meth 4");
    }
}


public class Inherutance_58_Interface {
   public static void main(String[] args) {
    MySampleClass m = new MySampleClass();
    m.meth1();
    m.meth2();
    m.meth3();
    m.meth4();
   } 
}
