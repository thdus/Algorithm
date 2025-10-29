import java.util.*;

class Solution {
    static boolean[] visited;
    static Set<Integer> numberSet;
    
    public int solution(String numbers) {
        
        numberSet = new HashSet();
        visited = new boolean[numbers.length()];
        
        int cnt = 0;
        dfs("",numbers);
        
        for(int num : numberSet){
            if(isPrime(num)){
                cnt++;
            }
        }
        
        
        return cnt;
    }
    private void dfs(String s, String numbers){
        
        if(!s.equals("")){
            numberSet.add(Integer.parseInt(s));
        }
        
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
        } return true;
    }
}