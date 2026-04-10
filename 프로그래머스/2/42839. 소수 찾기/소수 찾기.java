import java.util.*;

class Solution {
    static boolean[] visited;
    static Set<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        visited= new boolean[numbers.length()];
        int cnt = 0;
        dfs("",numbers);
        for(int num:numberSet){
            if(isPrime(num)){
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public static void dfs(String current, String numbers){
        if(!current.equals("")){
            numberSet.add(Integer.parseInt(current));
        }
        
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(current+numbers.charAt(i),numbers);
                visited[i]=false;
            }
        }
    }
    
    public static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }return true;
    }
}