import java.util.*;

public class Array_Deque_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(3);
        ad1.add(4);
        ad1.add(5);
        ad1.add(7);
        ad1.addFirst(9);
        ad1.addLast(20);

       System.out.println(ad1.getFirst());
       System.out.println(ad1.getLast());
    }
}
