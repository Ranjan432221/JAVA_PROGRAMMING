import java.util.*;
// @FunctionalInterface
// public interface myFunctionalInterFace{
//     void thisMethod();
//     void this
        
  
    
// } 

class Phon {
    public void showTime() {
        System.out.println("ther is a issue will be happen");
    }
}

class NewPhone extends Phon {
    @Override  /* This is the annotation in java */
    public void showTime() {

        System.out.println("time is 8 pm");

    }

    // @Deprecated
    // public int add (int a, int b){
    //     return a + b;
    // }
}

public class myFunction_108 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")/* ide ka aawaj dabanaa */
        NewPhone pho = new NewPhone();
        pho.showTime();

        // pho.add(5,6);

        Phon p = new Phon();
        p.showTime();

        

    }
}
