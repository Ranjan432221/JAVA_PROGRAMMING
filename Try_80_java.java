

public class Try_80_java {
    public static void main(String[] args) {
        int a = 6000;
        try{
            int b = 0;
            int c = a/b;
            System.out.println("the result is"+ c);
        }
        catch(Exception e){
           System.out.println("we failed to divide.Reason");
           System.out.println(e);
        }
       
    }
}
