import java.util.*;


class CalculatRectangleArea{
    private double length, breadth;
    public double claculateArea(double length, double breadth){
        return length*breadth;
    }

    public double calculatePerimeter(double length, double breadth){
        return 2*(length+breadth);
    }
}

public class Rectangle {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length");
    int length = sc.nextInt();

    System.out.println("enter the widthe of th e rectangle");
    int breadth = sc.nextInt();

    CalculatRectangleArea c = new CalculatRectangleArea();

   double area = c.claculateArea(length,breadth);
 double perimeter = c.calculatePerimeter(length, breadth);

 System.out.println("the area of the rectabgle is = "+area);
 System.out.println("the perimeter of the rectangle is = "+perimeter);
   }

    
}
