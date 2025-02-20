
/*
 * Primitive Data Type   	Wrapper Class
     byte	                     Byte
     short	                     Short
     int	                     Integer
     long	                     Long
     float	                     Float
     double	                     Double
     boolean	                 Boolean
     char	                     Character

     Sometimes you must use wrapper classes,
      for example when working with Collection objects,
       such as ArrayList, where primitive types cannot be used (the list can only store objects):
 */

public class Wrapper_Classes {
    public static void main(String[] args) {

        Integer myInt = 5;
        Double myDouble = 5.99d;
        Character myCharacter = 'c';
        Float myFloat = 45.6f;
        Long myLong = 787656l;
        Short myShort = 34;
        Boolean myBoolean = true;
        Byte myByte = 56;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myCharacter);
        System.out.println(myFloat);
        System.out.println(myLong);
        System.out.println(myShort);
        System.out.println(myBoolean);
        System.out.println(myByte);

        /*
         * For example, the following methods are used to get the value associated with
         * the corresponding wrapper object: intValue(), byteValue(), shortValue(),
         * longValue(), floatValue(), doubleValue(), charValue(), booleanValue()
         */

        System.out.println(" Wrapper class get value::" + myInt.intValue());
        System.out.println(" Wrapper class get value::" + myFloat.floatValue());
        System.out.println(" Wrapper class get value::" + myCharacter.charValue());
        System.out.println(" Wrapper class get value::" + myDouble.doubleValue());

        /*
         * Another useful method is the toString() method, which is used to convert
         * wrapper objects to strings.
         * 
         * In the following example, we convert an Integer to a String, and use the
         * length() method of the String class to output the length of the "string":
         */


         Integer myNewInt = 100;

         String myString = myNewInt.toString();

         System.out.println("here is the total count of a integer value into string ::"+myString.length());


         Integer mynewInteger = 34556;

         String myNewString  = mynewInteger.toString();
         System.out.println("here the total string count of my new string ::"+myNewString.length());
    }
}
