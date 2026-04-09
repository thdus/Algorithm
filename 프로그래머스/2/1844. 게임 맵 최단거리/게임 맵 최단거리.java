import java.util.*;

class Solution {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        n = maps.length;        // 행 개수
        m = maps[0].length;     // 열 개수

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0}); // 시작점

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵 범위 밖이면 무시
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                // 벽(0)이면 이동 불가
                if (maps[nx][ny] == 0) continue;

                // 아직 방문하지 않은 길(1)인 경우만 이동
                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1; // 현재까지 거리 + 1
                    q.offer(new int[]{nx, ny});
                }
            }
        }

        // 도착점 값이 여전히 1이면 도달 못한 것
        if (maps[n - 1][m - 1] == 1) return -1;

        return maps[n - 1][m - 1];
    }
}