///what is hierarchical Inheritence
//when two or more classes inherit a single class is known as hierarchical in heritence
class animal{
    void eat()
    {
        System.out.println("it is a eat");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("it is a barking ....");
    }
}
class babyDog extends animal{
    void ver()
    {
        System.out.println("it is a ver");
    }
}
class babyCid extends animal{
    void child()
    {
        System.out.println("it iss a chhild ");
    }
}
public class testInheritenceHierarchical{
    public static void main(String args[]){
        babyCid b = new babyCid();
        b.child();
        b.eat();
        b.bark();
    }
}