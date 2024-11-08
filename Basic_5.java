import java.util.*;
class Main{
    void a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of name");
        String a = sc.nextLine();

    }

    void Main2(){
        System.out.println("Enter the another name of the naother name");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println(b.concat("sahoo"));
       
    }

    void MainMain2(){
          a();
          Main2();   
    }
}



public class Basic_5 {
    public static void main(String args[]) {
           Main m = new Main();
           m.MainMain2();
    }
}
