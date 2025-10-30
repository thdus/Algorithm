import java.util.*;

class Solution {
    static boolean[] visited;
    static Set<Integer> numberSet;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        numberSet = new HashSet();
        dfs("", numbers);
        
        int cnt =0;
        for(int n:numberSet){
           
            if(isPrime(n)){
                 System.out.println(n);
                cnt++;
            }
        }
        
          return cnt;
    }

    

    
    private void dfs(String s, String numbers){
        if(!s.equals("")) numberSet.add(Integer.parseInt(s));
        
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(s+numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
    return true;
    }
}