//here we are discusing about the Interface
//Interface in java is a blue print of a class. It has static constants and abstract methods


/*-->Why we use the java interface? below the ans
there are mainly three reason to use the interface
1)it is used to achieve abstraction
2)By interface we can support the functionality of multiple Inheritance
3)it can be used to achieve loose Coupling
*/
/*when we implement the Interface then we have to use the "implements keyword" */
/*when we create the interface there we have to exchange the class cause we can write the interface instead of class
eg--> class bike{
} --> we can use the interface instead of class look here   interface bike{};
 *
 * 
 * -->when we implements the interface method then there time we have to declare that method public
 * 
 * 
 * we can implement morethan one interface but we cant use the  abstraction class morethen one 
 * 
 * we cant create the object of the interface 
 */

import java.util.*;


interface Bycicle{
    int a = 45;//here it is the final value this value you cant change any where
                //because within the interface if you assign value into any variable that must be final always

    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a =676;
    void blowHornK3g();
    void blowHornmhn();
}

  class AvoneCycle implements Bycicle{
    
    void blowHorn(){
        System.out.println("pee pee poo poo..");
    }
   public void applyBreak(int decrement){
          System.out.println("apply break...");
    }

   public void speedUp(int increment){
       System.out.println("doing speed up...");
    }


   public void blowHornK3g(){
System.out.println("kabhi khusi kabhi gum pee pee pee pee");
    }





     public void blowHornmhn(){
        System.out.println("main hum naa poo poo poo");
    }
}

public class Interface_54_Class {
    public static void main(String[] args) {
        
    AvoneCycle cycleRanjan = new AvoneCycle();
    cycleRanjan.applyBreak(1);
    cycleRanjan.speedUp(1);
  //You can create properties in interfaces
    System.out.println(cycleRanjan.a);
    //you cannot modify properties in interfacesas they are final
        // cycleRanjan a = 452;
        // System.out.println(cycleRanjan.a);
        cycleRanjan.blowHorn();


        cycleRanjan.blowHornK3g();
        cycleRanjan.blowHornmhn();


        System.out.println(cycleRanjan.a);



    }
}
