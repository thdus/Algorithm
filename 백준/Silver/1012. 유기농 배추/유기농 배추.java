import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[N][M];
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x]=1;
			}
			int cnt=0;
			Queue<int[]> q = new LinkedList<>();
			boolean[][] visited = new boolean[N][M];
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(arr[y][x]==1&&!visited[y][x]) {
						cnt++;
						int[] a = {x,y};
						q.add(a);
						while(!q.isEmpty()) {
							int[] e = q.poll();
							for(int d=0; d<4; d++) {
								int nx = e[0]+dx[d];
								int ny = e[1]+dy[d];
								
								if(nx<0||nx>=M||ny<0||ny>=N||arr[ny][nx]==0||visited[ny][nx]) continue;
								q.add(new int[] {nx,ny});
								visited[ny][nx]=true;
								
							}
						}
					}
				}
			}
			sb.append(cnt).append('\n');			
		
		}
		System.out.println(sb);
	}
}