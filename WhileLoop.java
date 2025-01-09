import java.util.*;
public class WhileLoop {
    public static void main(String args[]){
        int n;
        System.out.println("Enter any number up to print");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0;
        while(i<=n)
        {
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }//primarily 3 types of loop for-loop,while- loop,do-while-loop;
}
