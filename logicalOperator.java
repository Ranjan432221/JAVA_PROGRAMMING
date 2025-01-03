public class logicalOperator {
    public static void main(String args[]){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a&&b && c)
        {
            System.out.println(("Y"));
        }
        else
        {
            System.out.println("N");
        }
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if(a1 || b1 && c1)
        {
            System.out.println(("Y"));
        }
        else
        {
            System.out.println("N");
        }
    }
}
