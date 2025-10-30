import java.util.*;

class Solution {
    static boolean[] visited;
    static int ans;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        ans = 0;
        ans = dfs(k, dungeons, 0);
        
        return ans;
        
    }
    
    private int dfs(int k, int[][] dungeons, int cnt){
        
        ans = Math.max(ans, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]&&k>=dungeons[i][0]){
                visited[i] = true;
                dfs(k-dungeons[i][1], dungeons, cnt+1);
                visited[i] = false;
            }
        } return ans;
    }
}