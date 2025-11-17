import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        // 정렬: 1) 길이 오름차순  2) 길이 같으면 사전순
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2); // 사전순
            } else {
                return o1.length() - o2.length(); // 길이순
            }
        });

        StringBuilder sb = new StringBuilder();
        String prev = "";

        for (int i = 0; i < N; i++) {
            // 바로 이전 단어와 같으면(중복) 건너뛰기
            if (!words[i].equals(prev)) {
                sb.append(words[i]).append('\n');
                prev = words[i];
            }
        }

        System.out.print(sb);
    }
}
