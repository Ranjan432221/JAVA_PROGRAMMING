class patrn_recursion {
    static void pattern(int n)
    {
        if(n>0)
        {
             pattern(n-1);
             int i=5;
            for(int j=i;j>n;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
       pattern(4);
    }
}
