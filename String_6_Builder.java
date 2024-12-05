/*1) StringBuilder append() method
The StringBuilder append() method concatenates the given argument with this String. */

public class String_6_Builder {
   public static void main(String args[]) {
      StringBuilder s = new StringBuilder("Hello");
      s.append(" java");
      System.out.println(s);

      /* StringBuilder insert() */

      StringBuilder s1 = new StringBuilder("hello");
      s1.insert(1, "java");

      System.out.println("here this is a stringBuilder insert method in string " + s1);// hjavello

      /* StringBuilder replace() method */

      StringBuilder s2 = new StringBuilder("iamranjan");
      s2.replace(1, 4, "java");
      System.out.println("this is the replace in java StringBuilder " + s2);

      /* StringBuilder delete() method in java */

      StringBuilder s3 = new StringBuilder("hello");
      s3.delete(1, 4);
      System.out.println(s3);

      StringBuilder s5 = new StringBuilder("hello");
      String s6 = s5.substring(2, 5);
      System.out.println(s6);

      /* StringBuilder reverse method */

      StringBuilder s7 = new StringBuilder("ranjan");
      s7 = s7.reverse();
      String s8 = s7.toString();
      System.out.println("the revese of the stringBuilder " + s8);

      /* StringBuilder capacity() method in stringbuilder in java */

      StringBuilder s9 = new StringBuilder();
      System.out.println("The capacity in java " + s9.capacity());

      s9.append("java is my favourite language");
      System.out.println(s9.capacity());

      s9.append("java");
      System.out.println(s9.capacity());

      s9.append("roudy");
      System.out.println(s9.capacity());

      /* ensureCapacity() in StringBuilder */
      StringBuilder s10 = new StringBuilder();
      System.out.println(s10.capacity());

      s10.append("java is a rreally awsome language");
      System.out.println(s10.capacity());

      s10.ensureCapacity(10);
      System.out.println(s10.capacity());

      s10.ensureCapacity(50);
      System.out.println(s10.capacity());

      /*
       * String and StringBuffer HashCode Test
       * As we can see in the program given below, String returns new hashcode while
       * performing concatenation but the StringBuffer class returns same hashcode.
       */
         System.out.println("HAsh cade test of string in  java");
       String str = "java";
       System.out.println(str.hashCode());
       str = str+"tpoint";
       System.out.println(str.hashCode());

       System.out.println("hashCode test of stringBuffer in java");
       StringBuffer s11 = new StringBuffer("ranjan");
       System.out.println(s11.hashCode());
       s11 = s11.append("tpoint");
       System.out.println(s11.hashCode());



   }
}
