//Java String buffer class
/*Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed. */
//what is mutable string=> A string that can be modified or changed known as mutable string
public class String_5_Buffer {
    public static void main(String[] args) {

        /*
         * 1) StringBuffer Class append() Method
         * The append() method concatenates the given argument with this String.
         */
        StringBuffer s = new StringBuffer("hello");
        // s= s.reverse();
        // String s1 = s.toString();
        // System.out.println(s1);

        s.append(" java");// now original string is changed
        System.out.println(s);// prints hello java

        /*
         * 2) StringBuffer insert() Method
         * The insert() method inserts the given String with this string at the given
         * position.
         */

        StringBuffer sb = new StringBuffer("hello");
        sb.insert(3, "java");// now original string changed
        System.out.println(sb);// prints heljavalo

        /*
         * 3) StringBuffer replace() Method
         * The replace() method replaces the given String from the specified beginIndex
         * and endIndex.
         */

        StringBuffer s2 = new StringBuffer("hello");
        s2.replace(1, 3, "java");
        System.out.println("here is the replace method ude in the stringbuffer " + s2);// prints hjavalo

        /*
         * 4) StringBuffer delete() Method
         * The delete() method of the StringBuffer class deletes the String from the
         * specified beginIndex to endIndex.
         */

        StringBuffer s3 = new StringBuffer("ranjan");
        s3.delete(2, 3);
        String s5 = "chandan";
        String s4 = s5.substring(3, 5);
        System.out.println("this  is the substring in java " + s4);
        System.out.println("This is the delete method use in the stringbuffer in java " + s3);

        /*
         * 5) StringBuffer reverse() Method
         * The reverse() method of the StringBuilder class reverses the current String.
         */

        StringBuffer s7 = new StringBuffer("rahul");
        s7 = s7.reverse();
        String s8 = s7.toString();
        System.out.println(s8);

        /* 6) StringBuffer capacity() Method */
        /*
         * The capacity() method of the StringBuffer class returns the current capacity
         * of the buffer. The default capacity of the buffer is 16. If the number of
         * character increases from its current capacity, it increases the capacity by
         * (oldcapacity*2)+2. For example if your current capacity is 16, it will be
         * (16*2)+2=34.
         */

        StringBuffer st = new StringBuffer();
        System.out.println(st.capacity());

        // String st1 = "Hello";
        st.append("hello");
        System.out.println(st.capacity());

        st.append("ranjan is a bad boy in this world never seen again any where");
        System.out.println(st.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

        // st.append("ruturaj");
        // System.out.println(st.capacity());

        // st.append("gaikward");
        // System.out.println(st.capacity());

        // st.append("gaikwarde");
        // System.out.println(st.capacity());

        // st.append("gaikwardv");
        // System.out.println(st.capacity());

        /*
         * 7) StringBuffer ensureCapacity() method
         * The ensureCapacity() method of the StringBuffer class ensures that the given
         * capacity is the minimum to the current capacity. If it is greater than the
         * current capacity, it increases the capacity by (oldcapacity*2)+2. For example
         * if your current capacity is 16, it will be (16*2)+2=34.
         */

         StringBuffer sd = new StringBuffer();
         System.out.println(sd.capacity());//16

         sd.append("hello");
         System.out.println(sd.capacity());//16

         sd.append("everything in this world become furious");
         System.out.println(sd.capacity());//44

         sd.ensureCapacity(10);
         System.out.println(sd.capacity());//44

         sd.ensureCapacity(50);
         System.out.println(sd.capacity());//now 90
    }
}
