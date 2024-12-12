import java.util.*;
public class RitikSubstringTask {
public static void main(String args[]) {
  Scanner scanner  = new Scanner(System.in);
  
  int N = scanner.nextInt();
  scanner.nextLine();
  
  List<String>  substrings = new ArrayList<>();
  for(int i = 0; i < N; i++) {
    substrings.add(scanner.nextLine());
  }
  String mainString = scanner.nextLine();
  int k = scanner.nextInt();
  scanner.close();
  
  String result = findConstructedString(substrings,mainString, k);
    System.out.println(result);
}
  static String findConstructedString(List<String> substrings,String mainString,int k) {
    int mainLen = mainString.length();
    int[] dp = new int[mainLen + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    
    for(int i = 0; i <= mainLen; i++) {
      if(dp[i] == Integer.MAX_VALUE) continue;
      for(String sub : substrings) {
        int j = i; int subIndex = 0;
        int deletion = 0;
        
        while(j < mainLen && subIndex < sub.length()) {
          if(mainString.charAt(j) == sub.charAt(subIndex)) {
            subIndex++;
          } else {
            deletion++;
          }
             j++;
             }
             if(subIndex == sub.length()) {
               dp[j] = Math.min(dp[j],dp[i] + deletion);
             } 
            } 
          }
             if(dp[mainLen] == Integer.MAX_VALUE) {
               return "Impossible";
             } else if(dp[mainLen] <= k) {
               return "Possible";
             } else {
               for(int i = mainLen; i >= 0; i--) {
                 if(dp[i] <= k) { 
                   return mainString.substring(0,i);
                 }
               }
               return "Nothing";
             }
            }
          }
             
                 
             
               