import java.util.*;

public class Java_Doc_107 {
/**
 * 
 * @param args These are arguments suplied to the command line
 * 
 */

    public static void main(String[] args) {
        System.out.println("i am a main method");
    }

    /**
     * 
     * @param i this is the  first number to add 
     * @param j this is the scond number to add
     * @return sum of two number as an integer
     * @throws Exception if i is 0
     * @depricated this method is depricated ue + operator
     */

    public int add(int i, int j)throws Exception{

        if(i == 0){
            throw new Exception();
        }
          
        int c = i = j;

        return c;
    }
}
