import java.util.*;

//we can use the protected,public,default use in same class access in same package also



class C1{
    public int x = 5;
    protected int y = 45;
   int z = 6;
   private int  a = 78;

   int getValue(){
    return a;
   }
}



public class Access_66_Modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println(c.getValue());
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);

    }
}
