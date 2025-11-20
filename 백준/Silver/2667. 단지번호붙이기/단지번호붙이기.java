import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			arr[i] = s.toCharArray();
		}
		
		boolean[][] visited = new boolean[n][n];
		Queue<int[]> q = new LinkedList();
		ArrayList<Integer> list = new ArrayList();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(visited[i][j]) continue;
				
				if(arr[i][j]=='0') continue;
				
				
				q.add(new int[] {i,j});
				visited[i][j] = true;
				int cnt=1;
				
				while(!q.isEmpty()) {
					int[] cur = q.remove();
					int x = cur[0];
					int y = cur[1];
					
					for(int d=0; d<4; d++) {
						int nx = x+dx[d];
						int ny = y+dy[d];
						
						if(nx<0||nx>=n||ny<0||ny>=n) continue;
						if(visited[nx][ny]||arr[nx][ny]=='0') continue;
						
						cnt++;
						visited[nx][ny] = true;
						q.add(new int[] {nx,ny});
						
					}
				}
				list.add(cnt);
			}
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()+"\n");
		for(int i:list) {
			sb.append(i+"\n");
		}
		
		System.out.println(sb);
		
	}
}

/**
 * 목표 : 단지 내 1의 개수
 * - 첫 방문 일 때만 구하기 : 1이고 visited false
 * 
 * 1. 처음부터 끝까지 모든 칸을 다 확인하기
 * - if 해당 칸 값: 1이고, visited: false이면 -> 새 단지 진입
 *   - bfs
 *   - 4방향 확인하면서
 *   - if 범위내이고, 1이고, visited: false이면
 *     - cnt += 1
 *     - visited -> true
 * 
 * 2. list에 각 단지별 cnt값 저장
 * 
 * 3. list의 크기 출력
 * 
 * 4. list 값 오름차순 출력
 * 
 */