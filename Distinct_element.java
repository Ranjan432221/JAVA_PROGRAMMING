import java.util.ArrayList;
import java.util.HashSet;
public class Distinct_element {
    static ArrayList<Integer> findDistinct(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for(int num : arr) {
            st.add(num);
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int []arr = {12,10,9,45,2,10,10,45};
        ArrayList<Integer> rest = findDistinct(arr);
        System.out.println(rest);
    }
}
