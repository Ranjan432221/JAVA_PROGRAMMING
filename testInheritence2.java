class animal{
    void eat()
    {
        System.out.println("eating....");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("barking.....");
    }
}
class babyDog extends dog{
    void hunger()
    {
        System.out.println("it is a hunger");
    }
}
class childDog extends babyDog{
    void child()
    {
        System.out.println("it is a child ");
    }
}

public class testInheritence2{
    public static void main(String args[]){
        childDog d = new childDog();
        d.child();
        d.hunger();
        d.bark();///it is a multilevel inheritence example
    }
}


