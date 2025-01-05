import java.util.*;
//it is all about the method overriding in java 
//when we are going to make a oveririding method that time we have to use Anotation @Override
//metho overriding means base class methods name and parameter same as the derived class method name and parameter
//when you ruun the programm then that time we have to decide which method you want to run 
//then you have to choose the that class and make the object and call that metho 

class A{
    public int a = 6;

    public void method1(){
        System.out.println("this is a method one");
    }
    public void meth2(){
        System.out.println("this is a method 2 in class A");
    }
    
}

class B extends A{

    @Override  //--> This is the Anotation of the java programming
    public void meth2(){
        System.out.println("this is the method 2 in class B");
    }
}

//above classes we make the two  different type of class base  class A and derived class B
//and the both class have the meth2() method this is the method overriding 

public class method_48_Overriding {
    public static void main(String[] args) {
     A a = new A();
     a.meth2();

     B  b = new B();
     b.meth2();

    }
}

// wew cant override in static method and the final method and also the private method we cant do the override

