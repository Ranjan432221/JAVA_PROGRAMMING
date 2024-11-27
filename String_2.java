public class String_2 {
    public static void main(String[] args) {
        //using == operator
          
        String i = "rahul";
         String i1 = "rahul";
         String i2 = new String("rahul");
         
         System.out.println(i==i1);//true
         System.out.println(i==i2);//false (because i2 refers to instance created in nonpool)  


         /*use of the compareTo() method */
         String n3 = "Ratana";
         String n1 = "sachin";
         String n2 = "sachin";

         System.out.println(n1.compareTo(n2));//0
         System.out.println(n1.compareTo(n3));//1(bcz n1>n3)
         System.out.println(n3.compareTo(n1));//-1(bcz n3<n1)

    }
}
