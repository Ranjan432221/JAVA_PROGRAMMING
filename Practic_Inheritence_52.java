import java.util.*;
class Circle{
    public int radius;

    Circle(){
        System.out.println("i am not a parameterized constructor");
    }
    
    Circle(int r){
        System.out.println("i am a circle parameterized constructer");
        this.radius = r;
    }
    public double area(){
        return 3.142f * this.radius * this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

     Cylinder(int r, int h){
        super(r);
        this.height = h;
    }
   

    public double volume(){
        return 3.142f * this.radius * this.radius * height;
    }
}

public class Practic_Inheritence_52 {
    public static void main(String[] args) {
        //problem 1
        Circle l = new Circle();
        // System.out.println("the area of the circle is ="+l.area());
        // Cylinder c = new Cylinder(12,14);
        // System.out.println("the volume of cirle="+c.volume());
    }
}
