import java.util.*;
/*here we found the area of the rectangle and thge perimeter and also area of the triangle and square */

public class Basic_2 {
    public static void main(String...args) {
        System.out.println("Enter the height and breadth ");
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();

        int area = h*b;
        System.out.println(" the are of the rectanngle is = "+area);

        int perimeter = 2*(h+b);
        System.out.println("the perimeter of the rectangle = "+perimeter);

       double area_Of_Triangle = (0.5*h*b);

       System.out.println("The area of the triangle is = "+area_Of_Triangle);


       System.out.println("Enter the side of the square ");
       int s = sc.nextInt();
       float area_Of__square = s*s;
       System.out.println("the area of teh square is = "+area_Of__square);

    }
}
