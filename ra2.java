import java.util.*;
public class ra2 {
    public static void main(String args[]){
       int choice;
       System.out.println("Enter your choice ,1 for the noodles,2 for the milkshakh,3 for the fruits,4 for the cofee");
       Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
       if(choice==1)
       {
        System.out.println("noodles");
       }
       else if(choice==2)
       {
        System.out.println("milkshake");
       }
       else if(choice==3)
       {
        System.out.println("fruits");
       }
       else if(choice==4)
       {
        System.out.println("coffe");
       }
       else
       {
        System.out.println("invalid out put");
       }
    }
}
