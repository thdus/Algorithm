import java.io.*;
import java.util.*;

public class Main {
    // 종이의 크기 n
    static int n;
    // 파란색(1)과 흰색(0) 색종이 개수
    static int blue = 0, white = 0;
    // 입력으로 주어진 색종이 정보 배열
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력 (한 변의 길이)
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        // 색종이 정보 입력 (0: 흰색, 1: 파란색)
        for (int y = 0; y < n; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int x = 0; x < n; x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        // 전체 종이에 대해 탐색 시작
        find(0, 0, n);

        // 결과 출력
        System.out.println(white);
        System.out.println(blue);
    }

    /**
     * (x, y)를 시작으로 하는 num × num 크기의 종이가
     * 모두 같은 색인지 확인하고, 아니라면 4등분하여 재귀적으로 확인하는 함수
     */
    private static void find(int x, int y, int num) {
        int sum = 0;

        // 현재 영역의 합을 구함 (0이면 흰색, num*num이면 파란색)
        for (int i = y; i < y + num; i++) {
            for (int j = x; j < x + num; j++) {
                sum += arr[i][j];
            }
        }

        // 모두 흰색인 경우
        if (sum == 0) {
            white++;
        }
        // 모두 파란색인 경우
        else if (sum == num * num) {
            blue++;
        }
        // 섞여 있는 경우 → 4등분하여 재귀 탐색
        else {
            if (num != 1) { // 최소 크기(1x1)일 때는 더 이상 쪼갤 수 없음
                find(x, y, num / 2); // 왼쪽 위
                find(x + num / 2, y, num / 2); // 오른쪽 위
                find(x, y + num / 2, num / 2); // 왼쪽 아래
                find(x + num / 2, y + num / 2, num / 2); // 오른쪽 아래
            }
        }
    }
}
