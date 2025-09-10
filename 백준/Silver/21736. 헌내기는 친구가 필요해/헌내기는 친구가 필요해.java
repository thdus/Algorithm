

import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int Ii = -1;
		int Ij = -1;
		
		char[][] arr = new char[N][M];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				if(arr[i][j]=='I') {
					Ii = i;
					Ij = j;
				}
			}
		}
		
		boolean[][] visited = new boolean[N][M];
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {Ii,Ij});
		
		visited[Ii][Ij] = true;
		
		int cnt=0;
		
		while(!q.isEmpty()) {
			int[] now = q.remove();
			
			for(int i=0; i<4; i++) {
				int nx = now[0]+dx[i];
				int ny = now[1]+dy[i];
				
				if(nx<0||ny<0||nx>=N||ny>=M) {
					continue;
				}
				
				if(visited[nx][ny]) continue;
				if(arr[nx][ny]=='X') continue;
				if(arr[nx][ny]=='P') cnt++;
				
				visited[nx][ny] = true;
				q.add(new int[] {nx,ny});
			}
		}
		
		if(cnt==0) {
			System.out.println("TT");
		}else {
			System.out.println(cnt);
		}
	}
}