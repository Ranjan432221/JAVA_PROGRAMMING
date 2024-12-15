import java.util.*;

public class officeRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        
        List<List<Integer>> friendships = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friendships.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            friendships.get(a).add(b);
            friendships.get(b).add(a);
        }
        
        
        int K = scanner.nextInt();
        scanner.close();
        
      
        boolean[] currentStatus = new boolean[N];
        Arrays.fill(currentStatus, true);
        
        int total_Rostered_Day = 0;
        int days = 0;
        
        while (total_Rostered_Day < K) {
            total_Rostered_Day += countWFO(currentStatus);
            days++;
            
            boolean[] nextStatus = new boolean[N];
            
            for (int i = 0; i < N; i++) {
                int friendsInOffice = countFriendsInOffice(currentStatus, friendships.get(i));
                if (currentStatus[i]) {
                  
                    nextStatus[i] = friendsInOffice == 3;
                } else {
                    
                    nextStatus[i] = friendsInOffice < 3;
                }
            }
            
            currentStatus = nextStatus;
        }
        
        
        System.out.println(days);
    }
    
    // Method to count employees working from office on a given day
    private static int countWFO(boolean[] status) {
        int count = 0;
        for (boolean s : status) {
            if (s) count++;
        }
        return count;
    }
    
    // Method to count number of friends working from office for an employee
    private static int countFriendsInOffice(boolean[] status, List<Integer> friends) {
        int count = 0;
        for (int friend : friends) {
            if (status[friend]) count++;
        }
        return count;
    }
}
