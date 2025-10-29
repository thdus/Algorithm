import java.util.*;

class Solution {
    static List<String> dict = new ArrayList<>();
    static String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        // 1️⃣ 모든 단어를 사전순으로 미리 생성
        dfs("", 0);

        // 2️⃣ 단어 리스트에서 해당 단어의 위치 찾기 (indexOf)
        return dict.indexOf(word) + 1;
    }

    // DFS로 길이 5 이하의 모든 조합 생성
    private void dfs(String str, int depth) {
        if (depth > 5) return;

        if (!str.equals("")) dict.add(str); // 빈 문자열 제외 후 추가

        for (String v : vowels) {
            dfs(str + v, depth + 1);
        }
    }
}
