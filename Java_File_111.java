/*Here we discuss about the how to create a file in java and its implimentation
 * 
 */

import java.util.*;
import java.io.File;
// import java.io.IOException;
import java.io.IOException;

public class Java_File_111 {
    public static void main(String[] args) /*throws IOException*/ {
           File myFile = new File("ranjan kumar sahoo");
          try{
            myFile.createNewFile();
          }
          catch(IOException e){
            System.out.println();
          }
          
    }
}
