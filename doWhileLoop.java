import java.util.*;
public class doWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any number which you want to print");
        n = sc.nextInt();
        int i = 0;
        do{
            if(i==6)
            {
                i++;
                continue;
            }
           
            System.out.println(i);
            i++;
        } while(i<=n);
    }
}
