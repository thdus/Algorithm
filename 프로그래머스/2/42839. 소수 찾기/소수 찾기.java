import java.util.*;

class Solution {
    // 전역 변수
    static boolean[] visited; // 방문 여부
    static Set<Integer> numberSet = new HashSet<>(); // 중복 제거용 집합

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];

        // 모든 길이의 조합 생성
        dfs("", numbers);

        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) count++;
        }
        return count;
    }

    // 깊이 우선 탐색으로 가능한 모든 조합 생성
    private void dfs(String current, String numbers) {
        if (!current.equals("")) {
            numberSet.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    // 소수 판별
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
