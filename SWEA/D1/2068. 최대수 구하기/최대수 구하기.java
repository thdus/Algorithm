import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int test=1; test<=t; test++) {
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			int ans = arr[9];
			
			System.out.println("#"+test+" "+ans);
		}

	}

}
