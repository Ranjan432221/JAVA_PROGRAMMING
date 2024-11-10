 import java.util.*;
 public class Ch2 {
    public static void main(String[]args){
        int a,b;
        char ch;
        System.out.println("enter 1st no:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("enter second number");
        b = sc.nextInt();
        System.out.println("enter \n + for add \n-sub\n*multi\n/div\n");
        ch =  sc.next().charAt(0);
       
        switch(ch)
        {
            case'+':
                System.out.println(a+b);
                break;
                case'-':
                System.out.println(a-b);
                break;
                case'*':
                System.out.println(a*b);
                break;
                case'/':
                System.out.println(a/b);
                break;
                default:
                System.out.println("invalid");
            
            }
       }   }
