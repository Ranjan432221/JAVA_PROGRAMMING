import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

class myDepricated {
    @Deprecated

    void meth() {

        System.out.println("i am meth  1");

    }
}

 interface MyInt{
    void display();
}

public class Java_Practice_112 {
    
    public static void main(String args[]) {
        // myDepricated d = new myDepricated();
        // d.meth();

       
        // MyInt m = ()-> System.out.println("here use the lamabda annotation");
        // m.display();
      

        //here write the java file and store the multiplication table
          int i = 9;
          String table = " ";
          for( int j = 0; j < 10; j++){
            table += i + "X"+(j+1)+ "=" +i*(j+1);
            table += "\n";
          }
        try{
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }catch(IOException e ){
            System.out.println("If see an erroe immidiate call");
            e.printStackTrace();
        }

        
        
        
    }
}
