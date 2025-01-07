import java.util.*;

class Animal{
    public static String name;
    public int n;

    public static void PrintAnimalName(){
        System.out.println("entr name of students ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("the name of student ="+name);
    }
}

class Dog extends Animal{
    public void PrintLeg(){
      System.out.println("this is a leg of dog have a 4 leg");
    }
}


public class Inheritance2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog.PrintAnimalName();
        d.PrintLeg();
    }
}
