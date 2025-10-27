import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자별 찍는 패턴
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자의 점수 저장
        int[] score = new int[3];

        // 정답 비교
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) score[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) score[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) score[2]++;
        }

        // 가장 높은 점수 찾기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        // 최고 점수를 받은 사람 목록 생성
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) result.add(i + 1);
        }
        
        System.out.println(result);
        // List → int[]
        int cnt = 0;
        int r[] = new int[result.size()];
        for (int i : result) {
		        r[cnt++] = i;
        }
        return r;
    }
}

