import java.util.*;

class Base1 {

    public Base1(){
        System.out.println("i am a constructor");
    }

    public Base1(int x){
        System.out.println("i am an overloaded constructor with value x:"+x);
    }
    public int x;

    public int getX(){
        return x;
    }

    public void SetX(int x){
       this.x = x;
    }

}

// 1st constructor run of the base class after the derived class
class Derived1 extends Base1{
    public int y;

    public Derived1(){
       // super(10); when we run the argument constructor in inheritence that time we have to use the SUPER(int) then we can run the argument wala overloaded constructor
        System.out.println("i am a constructior of the derived class");
    }

   public Derived1(int x,int y){
    super(x);
  System.out.println("iam overloaded constructor of derived with value as y:"+ y);
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    
    public ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }

    public ChildOfDerived(int x,int y, int z){  //PARAMETERIzed overloaded Constructor
        super(x,y);
        System.out.println("I am a child of derived constructor:"+z);
    }
}



public class inheriConstrctr {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(4,9);

        ChildOfDerived c = new ChildOfDerived(12,13,15);
    }
}
