import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());  // 좌표 개수 입력
        int[][] points = new int[N][2];           // N개의 좌표를 저장할 2차원 배열
        
        // 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]); // x 좌표
            points[i][1] = Integer.parseInt(input[1]); // y 좌표
        }

        // 정렬: x 기준 오름차순, x가 같으면 y 기준 오름차순
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // y 오름차순
            }
            return Integer.compare(a[0], b[0]);     // x 오름차순
        });

        // 결과 출력
        StringBuilder sb = new StringBuilder(); // 출력 속도 향상을 위해 StringBuilder 사용
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
