class Solution {
    public int solution(String name) {
        
        int answer = 0;
        int length = name.length();
        
        // 1️⃣ 알파벳 변경 비용
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }
        
        // 2️⃣ 좌우 이동 비용
        int move = length - 1;  // 기본값
        
        for (int i = 0; i < length; i++) {
            
            int next = i + 1;
            
            // 연속된 A 찾기
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            
            // 오른쪽 갔다가 돌아오기
            move = Math.min(move,
                    i * 2 + length - next);
            
            // 왼쪽 먼저 갔다가 오기
            move = Math.min(move,
                    i + 2 * (length - next));
        }
        
        return answer + move;
    }
}