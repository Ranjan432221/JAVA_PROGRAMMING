
class NegativeRadiusException extends Exception{
   @Override
   public String toString(){
    return "radius cannot be negative";
   }

   @Override
   public String getMessage(){
    return "radius cannot be negative";
   }
}


public class Throw_84_Throws {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = 3.142 * r * r;
        return result;
    }


    public int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            Throw_84_Throws t = new Throw_84_Throws();
            int c = t.divide(10, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exception");
        }

        try{
            double d = area(5);
            System.out.println("the area is="+d);
        }
        catch(Exception e){
            System.out.println("exception1");
        }
    }
}
