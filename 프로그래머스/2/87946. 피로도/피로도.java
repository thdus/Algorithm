import java.util.*;

class Solution {
    static boolean[] visited;
    static int max;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        max = 0;
       
        dfs(dungeons,k,0);
        return max;
    }
    
    public static void dfs(int[][] dungeons, int p, int cnt){
        max = Math.max(max, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]&&p>=dungeons[i][0]){
                visited[i]=true;
                dfs(dungeons, p-dungeons[i][1],cnt+1);
                visited[i]=false;
            }
        }
    }
}