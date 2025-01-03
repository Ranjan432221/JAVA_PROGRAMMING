import java.util.*;
public class Method_31 {
      static int logic(int x,int y)
      //we created a static method ,which means that it can be accessed
      //without creating object of the class;
      //PUBLIC =>which can only accessed by objects:
    {
        int z;
        if(x>y){
            z = x+y;
        }
        else
        {
            z = (x+y)*5;
            
        }
        return z;
    }
    public static void main(String args[]){
       // Method_31 obj = new Method_31();//OBJECT CREATED HERE
        int a = 5;
        int b= 7;
        int  c=Method_31.logic(a,b);//static method calling without creating object
        int a1 = 7;
        int b1 = 3;
        int c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
