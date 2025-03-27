import java.util.*;

// @FunctionalInterface /*
                     /* A functional interface is an interface that contains only one abstract
                      * method. They can have only one functionality to exhibit
                      */
// public interface myFunctionalInterFace1 {
//     void thisMethod();
//     // void thisMethod2();

// }

class Phon {
    public void showTime() {
        System.out.println("ther is a issue will be happen");
    }
}

class NewPhone extends Phon {
    @Override /* This is the annotation in java */
    public void showTime() {

        System.out.println("time is 8 pm");

    }

    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }
}

public class Java_Annotation_108 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation") /* ide ka aawaj dabanaa */
        NewPhone pho = new NewPhone();
        pho.showTime();

        pho.add(5, 6);

        Phon p = new Phon();
        p.showTime();

    }
}
