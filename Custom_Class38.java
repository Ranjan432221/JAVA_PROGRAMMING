import java.util.*;
class Empolyee{
    int id;
    int salary;
    String name;
    public void printDetails(){
      System.out.println("my id is "  + id);  
      System.out.println("my name is "  + name);  
    }
    public int getSalary(){
        return salary;
    }
}
public class Custom_Class38 {
    public static void main(String[] args) {
        System.out.println("this is your custom calss");
        Empolyee obj = new Empolyee();//instantiating a new Employee Object
        Empolyee john = new Empolyee();
        //setting attributes for john
        john.id = 87489;
        john.name = "rahul tripthy";
        john.salary = 43;
        //setting attributes for obj
        obj.id = 23;
        obj.name = "ranjan kumar sahoo";
        obj.salary = 45;
         //Printing attributs
        // System.out.println(obj.id);
        // System.out.println(obj.name);
        obj.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(john.salary);
    }
}
