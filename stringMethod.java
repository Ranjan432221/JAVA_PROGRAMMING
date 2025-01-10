public class stringMethod {
    public static void main(String args[]) {
        String name = "ranjan kumar sahoo";
        System.out.println(name);
        int value = name.length();


        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nonTrimingString = "     ranjan      ";
        System.out.println(nonTrimingString);
        System.out.println(nonTrimingString.trim());// cut the all space
        System.out.println(name.substring(4));// it print from 4 no index value to forward
        System.out.println(name.substring(2, 5));// this print only 2no index value to 5no index value between all value
                                                 // printed
        String r = "hello";
        System.out.println(r);
        System.out.println(r.replace('h' , 'y'));

      String place = "hello";
    System.out.println( place.replace("he" , "ye"));
       
    System.out.println(place.startsWith("u"));//trur/false
    System.out.println(place.endsWith("o"));//true /false



    System.out.println(place.charAt(0));
   String t = "parry";
    System.out.println(t.indexOf("r"));//return 1st index r->index value 2 so output 2


    String modifiedName = "harryharryrry";
    //System.out.println(modifiedName.indexOf("rry"));
    System.out.println(modifiedName.indexOf("rry",4));


    System.out.println(modifiedName.lastIndexOf("rry"));
    System.out.println(modifiedName.lastIndexOf("rry",4));//after 4no index search rry which index start from


    String equal = "rarry";
    System.out.println(equal.equals("rarry"));
    System.out.println(equal.equalsIgnoreCase("Rarry"));
     

    System.out.println("i am escape \t sequence\"double quote");
    //escape squence=>\t.\n,\",\\;
    }
}
