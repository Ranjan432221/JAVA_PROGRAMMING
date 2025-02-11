import java.util.*;
public class Found_Duplicate {
    public List<Integer> findDuplicate(int[] arr) {
          Set<Integer> set = new HashSet<>();
         List<Integer> duplicate = new ArrayList<>();

         for(int num : arr) {
            if(set.contains(num)) {
                duplicate.add(num);
            } else {
                set.add(num);
            }
         }

         return duplicate;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,2,3};
        Found_Duplicate fd = new Found_Duplicate();
        List<Integer> duplicate = fd.findDuplicate(ar);
        
       System.out.println("Duplicate Elements: "+duplicate);
    }
}
