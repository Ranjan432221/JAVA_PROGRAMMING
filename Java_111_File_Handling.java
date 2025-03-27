import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Java_111_File_Handling {
    public static void main(String args[]){
      /*   //how to create a file 
        File myFile = new File("ranjan.txt");
        try{
            myFile.createNewFile();
            System.out.pritln("File Created Successfully");
        }catch(Exception e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
            */

            /* 
        //code to write to a file
        File myFile = new File("ranjan.txt");
       try{
        FileWriter fileWriter = new FileWriter("ranjan.txt");
        fileWriter.write("this is our first file this java course\n ok by now");
        fileWriter.close();
        
       }catch(IOException e){
        //System.out.println("unable to load the java programming");
        e.printStackTrace();
       }
        */


        /* 

        //Read the file

        File myFile = new File("ranjan.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
            */

            //delete the file which we had created 

            File myFile = new File("ranjan.txt");
            if(myFile.delete()){
                System.out.println("i  have deleted file: "+myFile.getName());
            }else{
                System.out.println("some problem occured when deleting the file ");
            }
    }
}
