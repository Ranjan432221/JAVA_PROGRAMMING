@FunctionalInterface
interface Driver{
    void engine();
}

// class drive implements Driver{

//     @Override
//     public void engine(){
//         System.out.println("this engine never be start from the long time ");
//     }
// }

public class Java_Lambda3 {
    public static void main(String[] args) {
        // drive d = new drive();
        // d.engine();
        

        /*below the implimentation of the lambda in java */

      Driver d1 = () -> System.out.println("heere is the engene can start");
      d1.engine();

      //implementation of the anonnymous

      Driver d2 = new Driver(){
         
        @Override
        public void engine(){
            System.out.println("never be worry about it because of its a anonymous");
        }
      };
      d2.engine();
    }
}
