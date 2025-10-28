class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow; // 전체 칸 수

        for (int height = 3; height <= total / height; height++) {
            int width = total / height;

            // 노란색 부분 조건 확인
            if ((width - 2) * (height - 2) == yellow) {
                return new int[]{width, height};
            }
        }

        return new int[0]; // 정상적이면 여기까지 오지 않음
    }
}
