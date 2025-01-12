/*Here we are discuss about the Constructor */
/*When we create a constructor in our program there CLASS name is SAME of CONSTRUCTOR method  name */
/*constructor is used in program for initialize the object */
/*when we create an object in main function that time it is automatically invoked in main function */
/*- We can use the constructor OVERLOADING in program also */
/* java constructors are TWO type 1)DEFAULT Cnstructor , and PARAMeterizd Constructor */
import java.util.*;

class MyMainEmployee{
private int id;
 private String name;


 public MyMainEmployee(){  // method overload method //-->this is a Default Constructor 
    id = 45;
    name = "roudy rathor";
 }
   public MyMainEmployee(String Myname, int Myid ){  //here we create a constructor //--> this is PARAMETERIzed Constructor
    //  id = 45;                             //MyMainEmployee() method we can pass the arguiments in the constructor method
    //  name = "ranjan";  -->here these are use when we will not have the arguments in the constructor mathod
     

    this.name = Myname;
    this.id = Myid;  //--> thesee are use when we pass the arguments in the constructor method();

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        
//   MyMainEmployee ranjan = new MyMainEmployee("ranjan kumar sahoo",14);//here automatically Constructor method invoked / Call 
                                            //here calling constructor MyMainEmployee() method 
                                            //these are use when arguments pass in the constructor method

  MyMainEmployee ranjan = new MyMainEmployee();// this is  call the constructor method without passing the arguments
    
  System.out.println(ranjan.getId());
  System.out.println(ranjan.getName()); //-->thse are gives the output of the progam 

    }
}
