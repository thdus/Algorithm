import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        int cnt = 0;
        
        dfs(dungeons,k, cnt);
        
        return answer;
    }
    
    private void dfs(int[][] dungeons, int k, int cnt){
        
        answer = Math.max(answer, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]&&dungeons[i][0]<=k){
                visited[i] = true;
                
                dfs(dungeons, k-dungeons[i][1], cnt+1);
                visited[i] = false;
            }
        } 
    }
}