public class recursion {
    int fibonacci(int n) {
        if (n<=1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String args[]) {
        recursion obj = new recursion();
        int t = 8;
        for(int i=0;i<t;i++){
            System.out.print(obj.fibonacci(i) + " ");
        }
       
    }
}
