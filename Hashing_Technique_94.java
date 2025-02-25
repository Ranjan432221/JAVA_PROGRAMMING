/*Hashing Technique ->technique to convert key value pairs to indices*/
/*open addresing to handle the collision */
/*hash set
 * hash map
 * hashTable
 * LinkedHashMap
 * 
 * set is collection of unique item
 * 
 * if we take a HashSet value repeatdely but that only gives once that value
 */
import java.util.*;

public class Hashing_Technique_94 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,1.5f);

        myHashSet.add(11);
        myHashSet.add(11);
        myHashSet.add(3);
        myHashSet.add(8);
        myHashSet.add(54);

        System.out.println(myHashSet);
    }
}
