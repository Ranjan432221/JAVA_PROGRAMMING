class InvalidInputException extends Exception{
    
    @Override
    public String toString() {

        return "cannot add 8 and 9";
    }


    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}

class CannotdivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "cannot Divide by Zero Exception";
    }

    @Override

    public String getMessage(){
        return "exception not divide by any";
    }
}

class MaxInputException extends Exception{
    @Override

    public String toString(){
        return "never be multiply";
    }

    @Override

    public String getMessage(){
        return "this is the getMessage";
    }
}


class CustomCalculator{
    double add(double a, double b) throws InvalidInputException{

        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }

    double subtract(double a, double b){
        return a-b;
    }

    double multiPlication(double a, double b) throws MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }

        else if(a>7000 || b>7000){
            throw new MaxInputException();
        }
        return a*b;
    }

    double divide(double a, double b) throws CannotdivideByZeroException {
        if(b==0){
            throw new CannotdivideByZeroException();
        }
        return a/b;
    }
}


public class Practice_103_custom_Calculator {
    
    public static void main(String[] args) throws InvalidInputException,CannotdivideByZeroException,MaxInputException {
        
       
     CustomCalculator c = new CustomCalculator();
     
        // c.add(8,9);

        // c.divide(10, 0);
        // try{
            c.multiPlication(10000,10000);
        // }
        // catch(MaxInputException e){
        //     System.out.println("bekar hai");
        // }
    
    }
}
