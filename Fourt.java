import java.util.*;
public class Fourt {
    public static void main(String[]args){
        int start,end;
        System.out.println("enter the start of loop:");
        Scanner sc = new Scanner(System.in);
        start = sc. nextInt();
        System.out.println("\nenter the end of the loop:");
        end = sc. nextInt();
        if(start<=end){
            while(start<=end){
                System.out.println(start*5);
                start++;
            }
        }else{
            while(end<=start){
                System.out.println(start*5);
                start--;
            }
        }
        }
}


