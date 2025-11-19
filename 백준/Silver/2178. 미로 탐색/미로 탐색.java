import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			arr[i] = s.toCharArray();
		}
		
		boolean[][] visited = new boolean[n][m];
		Queue<int[]> q = new LinkedList();
		q.add(new int[] {0,0,1});
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			int[] cur = q.remove();
			int x = cur[0];
			int y = cur[1];
			int cnt = cur[2];
			
			for(int d=0; d<4; d++) {
				int nx = x+dx[d];
				int ny = y+dy[d];
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				
				if(visited[nx][ny]||arr[nx][ny]=='0') continue;
				
				if(nx==n-1&&ny==m-1) {
					System.out.println(cnt+1);
					return;
				}
				visited[nx][ny] = true;
				q.add(new int[] {nx,ny,cnt+1});
				
			}
		}
	}
}