import java.io.*;
import java.util.*;

public class Main {
	public static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n, m;

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		String[][] arr = new String[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			arr[i] = s.split("");
		}

		// bfs
		boolean[][] visited = new boolean[n][m]; // 들린 곳 = 이제 안 들릴 곳
//		Queue<Pair> q = new LinkedList<>(); // 들릴 곳
//		q.add(new int[] {0, 0});
		Queue<int[]> q = new LinkedList<>(); // 들릴 곳
		q.add(new int[] { 0, 0, 1 }); // 0: x, 1: y, 2: cnt
		visited[0][0] = true;
		while (!q.isEmpty()) {
			int[] cur = q.remove();
			int x = cur[0];
			int y = cur[1];
			int cnt = cur[2];

//			System.out.println(x + " " + y);
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				// 범위 확인
				if (nx < 0 || ny < 0 || nx >= m || ny >= n)
					continue;
				// 방문 여부 확인
				if (visited[ny][nx])
					continue;
				// 방문한 곳이 0일 때
				if (arr[ny][nx].equals("0"))
					continue;
				if (nx == m - 1 && ny == n - 1) {
					System.out.println(cnt + 1);
					return;
				}
				visited[ny][nx] = true;
				q.add(new int[] { nx, ny, cnt + 1 });
			}
		}
	}
}
