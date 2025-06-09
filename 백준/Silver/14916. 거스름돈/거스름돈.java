import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, 100_000); 
        dp[0] = 0; 

        for (int i = 1; i <= n; i++) {
            if (i >= 2) dp[i] = Math.min(dp[i], dp[i - 2] + 1);
            if (i >= 5) dp[i] = Math.min(dp[i], dp[i - 5] + 1);
        }

        if (dp[n] == 100_000) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }
    }
}
