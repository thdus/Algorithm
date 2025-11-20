import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {-1,-2,-2,-1,1,2,2,1};
	static int[] dy = {-2,-1,1,2,-2,-1,1,2};
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
	
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			boolean[][] visited = new boolean[n][n];
			Queue<int[]> q = new LinkedList();
			visited[x1][y1] = true;
			int cnt =0;
			q.add(new int[] {x1,y1, cnt});
			int min = Integer.MAX_VALUE;
			
			while(!q.isEmpty()) {
				int[] cur = q.remove();
				int x = cur[0];
				int y = cur[1];
				int count = cur[2];
				
				for(int d=0; d<8; d++) {
					int nx = x+dx[d];
					int ny = y+dy[d];
					
					if(nx<0||nx>=n||ny<0||ny>=n) continue;
					
					if(visited[nx][ny]) continue;
					
					if(nx==x2&&ny==y2) {
						min = Math.min(count, min);
						break;
					}
				    visited[nx][ny] = true;
					q.add(new int[] {nx,ny, count+1});
					
					
				}
			}
			if(min==Integer.MAX_VALUE) {
				
				sb.append(0+"\n");
			}else {
				sb.append(min+1+"\n");
			}
			
		}
		System.out.println(sb);
	}
}

/**
 * 
 * 
 */