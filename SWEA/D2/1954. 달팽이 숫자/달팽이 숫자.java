import java.util.Scanner;

public class Solution {
	static int[] dr = { 0, 1, 0, -1 }; 
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] nums = new int[N][N];

			int dir = 0;
			int r = 0, c = 0; 
			for (int i = 1; i <= N * N; i++) { 
				nums[r][c] = i;
				if (r + dr[dir] >= N || r + dr[dir] < 0 || c + dc[dir] >= N || c + dc[dir] < 0
						|| nums[r + dr[dir]][c + dc[dir]] != 0) {
					
					dir = (dir + 1) % 4; 
				}
				r += dr[dir];
				c += dc[dir];
			}
			System.out.println("#" + t);
			for (int i = 0; i < N; i++) {
				for (int n : nums[i])
					System.out.print(n + " ");
				System.out.println();
			}
		}

	}
}
