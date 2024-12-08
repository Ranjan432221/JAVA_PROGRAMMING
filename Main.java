// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class first {
    
    void method(){
   
       for(int i = 0; i <= 3; i++) {
           for(int j = 0; j <= 3; j++){
               if((i+j)>=3) {
                   System.out.print("j"+i+" ");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
    
    void Method1(){
       
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                if((i + j)>=3){
                    System.out.print(j*i+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    class Main{
        public static void main(String args[]){
            first f = new first();
            f.method();
            f.Method1();
        }
    }