import java.util.Scanner;

public class Ch4 {
    public static void main(String[]args){
        String a ;
        System.out.println("enter any string");
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        int count = a.length();
        System.out.println(count);
		switch(count)
		{
		case 1:
			System.out.println("Below 2");
 
			break;
		case 2:
			System.out.println("None of the above");
			break;
		case 3:
			System.out.println("None of the above");
			break;
		case 4:
			System.out.println("None of the above");
			break;
		case 5:
			System.out.println("None of the above");
			break;
		case 6:
			System.out.println("Between 5 to 7");
			break;
		case 7:
			System.out.println("None of the above");
			break;
		default:
			System.out.println("None of the above");
			break;
		}
	}
}

    

