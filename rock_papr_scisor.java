import java.util.*;
import java.util.Random;

public class rock_papr_scisor {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 0 for rock, 1 for papper, 2 for scissor");
        int userInput = sc.nextInt();

      Random random = new Random();
      int computerInput = random.nextInt(3);

      if(userInput == computerInput) {
        System.out.println("Draw");
      }
      else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
        System.out.println("you win");
      }
       else
       {
        System.out.println("computer win");
       }
       System.out.println("computer choice:" + computerInput);

    }
}
