/*collection represents a group of objects java collectuion provide classes and interfaces for us to write a 
 * code quickly and efficiently
 * 
 * collection class is available in java.util package
 */

import java.util.ArrayList;
import java.util.*;

public class Advance_Collection_88_java {
    public static void main(String[] args) {
        // ArrayList
        // Set
        // Treeset

        // ArrayList is a modified array
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>(5);
        ArrayList<Integer> L3 = new ArrayList<>(5);
        L3.add(12);
        L2.add(22);
        L2.add(14);
        L2.add(17);
        L2.add(17);
        L2.add(17);
        L2.add(11);
        L1.add(6);
        L1.add(5);
        L1.add(7);
        L1.add(0, 6);
        L1.addAll(0, L2);
        L1.set(1, 45);
        // L3.isEmpty();
        System.out.println("here L3 is empty true or false:" + L3.isEmpty());/*
                                                                              * here isEmpty() returns true if this list
                                                                              * contains no elements
                                                                              */
        // L1.remove(2);
        // L1.clear();
        // System.out.println(L1);
        System.out.println("here the index of "+L1.indexOf(17));

        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i));
            System.out.print(", ");
        }
        // L1.clone();
        // System.out.println(L1.clone());
        System.out.println(L1.contains(55));// if here available this value 55 then contains return true if this valu is
                                            // not available in here then "contains(value)" returm false
        // System.out.println(L1.indexOf(17));
        // System.out.println(L1);
        System.out.println(L3.lastIndexOf(1));
        System.out.println("the value of the L3"+L3);
        
        // System.out.println("last indexof the occurance:"+L3.lastIndexOf(0));


        ArrayList<String> list = new ArrayList<>();

        list.add("ranjan");
        list.add("rabindra");
        list.add("raghunatha");
        list.add("namji");
        list.add("roudy");

        //TRaversing list through iterator

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        // System.out.println(list);
    }
}
