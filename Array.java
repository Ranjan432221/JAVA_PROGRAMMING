import java.util.*;

public class Array{
    public static void main(String args[]){
            int row, col, sum = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value of row");
             row = sc.nextInt();

             System.out.println("Enter the value of the col");
             col = sc.nextInt();

            int arr[][] = new int[row][col];
            System.out.println("Here the array of the element");
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Here the original araay");
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(arr[i][j]+" ");
                    sum += arr[i][j];
                }
                System.out.println();
            }
            System.out.println("the sum of the array element is = "+sum);

    }
}