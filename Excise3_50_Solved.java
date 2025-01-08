import java.util.*;
import java.util.Random;
 
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    // public int getNoOfGueses(){
    //     return noOfGuesses;
    // }

    // public void setNoOfGuesses(int noOfGuesses){
    //     this.noOfGuesses = noOfGuesses;
    // }

    public  Game() {

        Random rand = new Random();
       this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("guesses the number");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("yes you guessed it right,it was %d\nyou guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("it is too low...");
        }
        else if(inputNumber>number){
            System.out.println("it is too high..");
        }
        return false;

    }
}

public class Excise3_50_Solved {
  public static void main(String[] args) {
    
    Game g = new Game();
    boolean b = false;
    while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
    }
  }  
}
