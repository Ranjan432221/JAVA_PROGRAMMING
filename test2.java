public class test2 {
    public static void main(String[] args) {
        // int a = 1234;

        int a = Integer.parseInt(args[0]);
        System.out.println("here is the value of a= "+ a);
         int b = a,s = 0,d,v = 0;

         d = b % 10;
         v = (d%2 == 0)?d:0;
         s = s+ v;

         b = b/10;
         d = b%10;
         v = (d%2 == 0)?d:0;

         b = b/10;
         d = b%10;
         v = (d%2 == 0)? d : 0;
         s = s+ v;

         d = b/10;
         v = (d%2 == 0)?d:0;
         s = s+v;

         System.out.println("sum of all even digit of"+ a + " = "+ s);
    }
}
