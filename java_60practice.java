import java.util.*;
abstract class Pen{
    abstract  void Write();
    abstract  void refil();
}

class FountainPen extends Pen{
    void Write(){
         System.out.println("Write");
    }
    void refil(){
    System.out.println("refil");
    }

    void changeNib(){
        System.out.println("changing the Nib");
    }
}

class Monkey{
    Monkey(){
        System.out.println("this is a monke constructor in the Monkey class");
    }
    void jump(){
        System.out.println("this is a Jumping....");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
  @Override
    public void eat(){
      System.out.println("eating..");
    }
  @Override
    public void sleep(){
       System.out.println("sleeping..");
    }
    void Speak(){
        System.out.println("Hello sir");
    }
}


public class java_60practice {
    public static void main(String[] args) {

        /*problem 1 + 2 */
        FountainPen f =new FountainPen();
        f.changeNib();
        f.Write();



        /*problem 3 */

        Human h = new Human();
        h.sleep();


        //q 5

        Monkey m1 = new Human();
// m1.speak()--> CAnnot use speak method because the reference is monkey which does not have speak method


        m1.jump();
        m1.bite();


        BasicAnimal lovish = new Human();

        lovish.eat();
        lovish.sleep();

        // lovish.speak();-->error
    }
}
