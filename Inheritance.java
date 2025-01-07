/*Here we are discusing about the inheritance  */


/*types of inheriteance in java are THREE types 1)single 2)multilevel 3)hierarchical Inheritance */
class Base{  //it is a base class/super class/parent class
    int x;
    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    
    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class Derived extends Base{  //-->it is a sub class/derived class/child class
  int y;
  public int getY(){
    return y;
  }

  public void setY(int y){
    this.y = y;
  }

}


public class Inheritance {
   public static void main(String[] args) {

    // Creating an object of base class
    //  Base b = new Base();
    //  b.setX(4);
    //  System.out.println(b.getX());

     //Creating an object of derived class

     Derived d = new Derived();
     d.setY(43);
     System.out.println(d.getY());
   } 
}
