import java.util.Scanner;

public class Eight {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for( int i=1;i<=100;i++)
        {
           if (i%3==0&&i%5==0) {
             System.out.println(i);
           }
        }
    }
}
