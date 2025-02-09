@FunctionalInterface

interface Right{
   void left();
}

// class wrong implements Right{

//     @Override
//     public void left(){
//         System.out.println("it is left in this field");    
//     }

//     public void foot(){
//         System.out.println(" these are the proper foot of the nibi");
//     }
// }



public class Java_Lambda {
    public static void main(String[] args) {
        // wrong w = new wrong();

        // w.left();
        // w.foot();

        //below the anonymous implimentation
        Right r = new Right(){
            
            @Override

            public void left(){
                System.out.println("it is a another left side of the program");
            }
        };
        r.left();



        //below the lambda implimentation

        Right t = () ->{
            System.out.println("here is the lambda implimentation");
        };
        t.left();
    }
}
