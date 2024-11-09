/*  Sum of product of consecutive odd digits of any 4 digit number? Supoose 
num=1356 then output= 5*3+ 3*1*/

import java.util.*;

public class Asign_1_5_e {
    public static void main(String[] args) {

        int a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 4digit number : ");
        int n = sc.nextInt();

        a = n % 10;
        n = n / 10;
        b = n % 10;
        n = n / 10;
        c = n % 10;
        n = n / 10;
        d = n % 10;

        int _1st_no = (d % 2 != 0) ? d : 0;
        int _2nd_no = (c % 2 != 0) ? c : 0;
        int _3rd_no = (b % 2 != 0) ? b : 0;
        int _4th_no = (a % 2 != 0) ? a : 0;

        int Consecutive_odd_Result = (_4th_no * _3rd_no) + (_3rd_no * _2nd_no) + (_2nd_no*_1st_no);

        System.out.println("output = "+_4th_no +"*"+ _3rd_no +"+"+ _3rd_no +"*"+ _2nd_no +"+"+ _2nd_no+"*"+_1st_no);

        System.out.println("Sum of product of consecutive odd digits of any 4 digit number = "+Consecutive_odd_Result);

    }
}
