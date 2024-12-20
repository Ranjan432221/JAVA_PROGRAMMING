import java.util.*;
public class Var_args33 {
    //  ...(triple dot ) is a varargs
    
    // static int sum(int x,int y){
    //     int result = x+y;
    //     return result;
       
    // }
    static int add(int ...arr){
        int result = 0;
       // for(int i=0;i<arr.length;i++)
       for(int a:arr)
        {
            result += a;
            //result+=arr[i];
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println("welcome to varargs");
       // System.out.print(sum(10,20));
       System.out.println(add(10,34));
       System.out.println(add(10,45));
       System.out.println(add(10,20,45));
       System.out.println(add(10,12,14));
    }
}
