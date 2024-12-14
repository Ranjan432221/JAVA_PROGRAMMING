/*find the area, parameter of the rectangle,circle,square,triangle */

import java.util.*;

class Box {
    int ln;
    int br;
    int ht;
    int radius;
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box r1 = new Box();

        System.out.println("Enter the length ");
        r1.ln = sc.nextInt();

        System.out.println("Enter the breadth ");
        r1.br = sc.nextInt();

        System.out.println("Enter the height ");
        r1.ht = sc.nextInt();

        System.out.println("Enetr the radius of the circle");
        r1.radius = sc.nextInt();

        int areaSquare = r1.ln * r1.ln;
        int perimeterSquare = 4 * r1.ln;

        int areaRectangle = r1.ln * r1.br;
        int perimeterRectangle = 2 * (r1.ln * r1.br);

        float areaCircle = 3.141f * r1.radius * r1.radius;
        float perimeterCircle = 2 * 3.141f * r1.radius;

        float areaTriangle = 0.5f * r1.br * r1.ht;
        int perimeterTriangle = r1.ln + r1.br + r1.ht;

        System.out.println("The area of sqaure is " + areaSquare);
        System.out.println("The perimeter of the square is " + perimeterSquare);

        System.out.println("The area of rectangle is " + areaRectangle);
        System.out.println("The perimeter of the rectabgle is " + perimeterRectangle);

        System.out.println("The area of circle is " + areaCircle);
        System.out.println("The perimeter of the circle is " + perimeterCircle);

        System.out.println("The area of triangle is " + areaTriangle);
        System.out.println("The perimeter of the triangle is " + perimeterTriangle);

    }
}
