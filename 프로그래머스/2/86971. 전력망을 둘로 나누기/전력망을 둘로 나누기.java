import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<List<Integer>> graph = new ArrayList();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList());
        }
        
        for(int[] wire : wires){
            int a = wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        int ans = Integer.MAX_VALUE;
        
        for(int[] cut : wires){
            int a = cut[0];
            int b = cut[1];
            
            int cnt = bfs(graph,n,a,b);
            
            int diff= Math.abs((n-cnt)-cnt);
            ans = Math.min(ans, diff);
        }
        return ans;
        
        
    }
    
    private int bfs(List<List<Integer>> graph, int n, int a, int b){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList();
        q.add(a);
        visited[a] = true;
       
        int cnt = 1;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int next : graph.get(cur)){
                if((cur==a&&next==b)||(cur==b&&next==a)) continue;
                
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}