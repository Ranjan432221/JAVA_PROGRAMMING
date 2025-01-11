import java.util.*;
public class ranjan{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [2][3];
        int [][] b = new int [2][3];
        int [][] c = new int [4][6];
        int sum = 0;
        System.out.println("take input of 1st array");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("below the array of 2nd");
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("below the sum of two arrays");
        for(int i=0;i<2;i++){
            for( int j=0;j<3;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println("below the sum of third array c");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum+=c[i][j];
                
            }
        }
        System.out.println(sum);
    }
}
