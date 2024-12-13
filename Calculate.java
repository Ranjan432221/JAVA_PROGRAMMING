abstract class Shape{
    abstract  double calculateArea();

   public void display(double area){
       System.out.println("the area is = "+area); 
    }

}

 class rectangle extends Shape{
    private double length, breadth;
    
    public rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
  double calculateArea(){
        return length*breadth;
    }
}

 class Square extends Shape{
    private double side;

   public Square(double side){
    this.side = side;
   }

   @Override
   double calculateArea(){
    return side * side;
   }
}

public class Calculate{
    public static void main(String args[]){
        rectangle r = new rectangle(5,3);

        double rectangleArea = r.calculateArea();
        r.display(rectangleArea);
            
        Square s = new Square(5);
        double squareArea = s.calculateArea();
        s.display(squareArea);

    }
}