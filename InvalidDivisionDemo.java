import java.util.*;
  interface DivisionCheck{
    void checkDivision(int numerator, int denominator) throws InvalidDivisionException;
 }

 class InvalidDivisionException extends Exception {
  public  InvalidDivisionException(String message){
        super(message);
    }
 }

 class Division implements DivisionCheck{
      @Override
      public void checkDivision(int numerator, int denominator) throws InvalidDivisionException{
        if(numerator % 2 == 0 && isPrime(denominator)){
            throw new InvalidDivisionException("Invalid division:numerator is even and denominator is prime");
        } else{
            System.out.println("result:" +numerator/denominator);
        }
      }

      private boolean isPrime(int num) {
        if(num <= 1) return false;
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) return false;
            }
        return true;
      }
 }



public class InvalidDivisionDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int numerator = sc.nextInt();
        System.out.println("enter the denominator ");
        int denominator = sc.nextInt();
        Division d = new Division();
        try{
            d.checkDivision(numerator, denominator);
        }catch(InvalidDivisionException e){
            System.out.println(e.getMessage());
        }
    }
}
