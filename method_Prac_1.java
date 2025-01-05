import java.util.*;
public class method_Prac_1 {
    //PROBLEM 1
    static void multiplication(int n)
    {
      for(int i=1;i<=10;i++)
      {
        System.out.println("the multi plication of n="+n*i);
      }
    }

    // PROBLEM 2 
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }

    //PROBLEM 8
   
static void print1_recursion(int n)
{
    if(n>0)
    {
        print1_recursion(n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        //pattern1_recursion(3) 
        //pattern1_recursion(2) +  3 times star and new line
        //pattern1_recursion(1) +  2 times star and new line + 3 times star and new line 
        //pattern1_recursion(0) +  1 times star and new line + 2 times star and new line + 3 times star and new line
    }
}




    //PROBLEM 3
    //1st n naturan number sum using recursion
    // sum(n) = 1+2+3+.....+n
    // sum(n) = 1+ 2 + 3+ ......+n-1+n
    // sum(n) = sum(n-1) + n
      static int sum(int n)
      // recursion use base condition
    {
       if(n==1)
       {return 1;}
       else
       {
           return n + sum(n-1);
       }
    }
     //PROBLEM 4
     static void pattern2(int n)
     {
        for(int i=0;i<n;i++)
        {
            for( int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     //PROBLEM 5
     static int fibbonacci(int n)
     {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibbonacci(n-1)+fibbonacci(n-2);
        }
     }
     static void average(int ...arr)
     {
        int sum =0;
        float avg;
        for( int i=0;i<=arr.length;i++)
        {
            sum +=arr[i];
        }
        avg = (float) sum /arr.length;
        System.out.println("the avg="+avg);
     }
   
    
    public static void main(String args[]){
      //multiplication(7);
      //pattern1(4);
    //   int c = sum(4);
    //   System.out.println(c);
    //pattern2(4);
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the value of a which up to necessary of find fibonacci");

    // int a;
    // a = sc.nextInt();
    // for(int i=0;i<a;i++)
    // {
    //     System.out.print(fibbonacci(i)+" ");
    //  }
    // average(12,20,32);
    print1_recursion(4);
    }
}
