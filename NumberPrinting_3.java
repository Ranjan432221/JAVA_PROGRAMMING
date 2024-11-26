
abstract class print {
    abstract void numberp() throws NegativeRadiusException;

    void bike() {
        int a = 10 + 20;
        System.out.println("\nthe sum of the two number is " + a);
    }
}


class NegativeRadiusException extends Exception{
    
    @Override
    public String toString() {
        return "this is a negative number";
    }
  
    @Override
    public String getMessage() {
        
        return "this is also a negative number";
    }
}

class p extends print {
    void numberp() throws NegativeRadiusException {
        int i = 0;
      if( i > 0){
        throw new NegativeRadiusException();
      }
            do {
                if (i == 3) {
                    i++;
                    continue;
                }
                System.out.print(i + " ");
                i++;
            } while (i <= 10);
        
        
    }
}

public class NumberPrinting_3 {
    public static void main(String[] args)  {
        try{
            print n1 = new p();
            n1.numberp();
            n1.bike();
        }catch(NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
       
    }
}
