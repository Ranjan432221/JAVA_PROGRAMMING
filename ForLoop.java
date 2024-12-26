import java.util.*;
public class ForLoop {
    public static void main(String args[]){
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }
        int n;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number which up to print");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            sum = sum + i; 
          }
          
        }
        System.out.println("the sum of odd number:" +sum);
            
    }
}
