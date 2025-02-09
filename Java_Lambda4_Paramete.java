@FunctionalInterface
interface LambdaExp{
    void meth1(int a, int b);  
}

// class add  implements LambdaExp{
//     public void meth1(int a , int b){
//         System.out.println("the sum of two number is ="+ (a+b));
//     }
// }


public class Java_Lambda4_Paramete {
    public static void main(String[] args) {
        // add a = new add();
        // a.meth1(4,5);

        //below the anonymous implimentation


       LambdaExp l = new LambdaExp(){
      

        @Override
        public void meth1(int a, int b){
            System.out.println(" the sum of the two vabriable is ="+(a+b));
        }
       };
        l.meth1(4,4);


        // below the implimentation of the lambda

        LambdaExp l1 = (a,b) ->{
             System.out.println("the sum of two number a  and b is :"+ a + "," + b);
        };
        l1.meth1(5,15);
    }
}
