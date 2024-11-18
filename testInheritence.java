class animal{
    void eat()
    {
         System.out.println("it is a animal ");
    }
 }
 class dog extends animal{
     void bark()
     {
         System.out.println("it is animal bark");
     }
 }
 public class testInheritence{
     public static void main(String args[])
     {
         dog m = new dog();
         m.bark();
         m.eat();
     }
 }