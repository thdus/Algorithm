class Solution {
    static boolean[] visited; // 던전 방문 여부 저장
    static int answer = 0;    // 최대로 탐험한 던전 수

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0); // 처음 피로도 k, 방문 수 0
        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 1️⃣ 현재까지 탐험한 개수를 answer에 저장 (최대값 유지)
        answer = Math.max(answer, count);

        // 2️⃣ 모든 던전에 대해 탐색
        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0]; // 최소 필요 피로도
            int use = dungeons[i][1];  // 소모 피로도

            // 아직 안 갔고, 체력이 충분하면 들어갈 수 있음
            if (!visited[i] && fatigue >= need) {
                visited[i] = true; // 방문 표시
                dfs(fatigue - use, dungeons, count + 1); // 다음 던전 탐색
                visited[i] = false; // 원상복구 (백트래킹)
            }
        }
    }
}
