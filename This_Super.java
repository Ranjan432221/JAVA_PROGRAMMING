//here we discuss about the this and super() key what is the basic required ment of this key in java program
/*super is a reference  */
import java.util.*;

class EkClass{
    int a; 
    //  EkClass(int a){
    //     this.a = a;  //here the this reference is necessary because herr argument and variable is same so that
    //  }
     EkClass(int  v){   //if argument as same as a variable name then that time we have to use the "this" reference to find out correct ans

      a = v;  // "this " is a reference
    }

    public int getValue(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor"+c);
    }
}


public class This_Super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getValue());

        DoClass d = new DoClass(10);
    }
}
