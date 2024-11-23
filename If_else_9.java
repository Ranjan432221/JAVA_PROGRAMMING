/*Calculate profit and loss */

import java.util.*;
public class If_else_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int profit,loss ;

        System.out.println("Enter cost price of the object");
        int costPrice = sc.nextInt();

        System.out.println("Enter the selling price of the object");
        int selingPrice = sc.nextInt();

        if(selingPrice > costPrice){
            profit = selingPrice - costPrice;
            System.out.println("The profit is "+profit);
        }else{
             loss = costPrice - selingPrice;
            System.out.println("no profit Loss "+loss);
        }

    }
}
