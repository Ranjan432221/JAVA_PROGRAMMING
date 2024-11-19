public class test3 {
    public static void main(String[] args) {
        // String fnm = args[0];
        // String lnm = args[1];
        // System.out.println("i am "+ fnm + " " + lnm);


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int g = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("the greatest is = "+ g);
    }
}
