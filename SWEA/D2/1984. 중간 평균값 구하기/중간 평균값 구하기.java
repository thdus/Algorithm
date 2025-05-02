import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for(int test=1; test<=t; test++) {
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			int sum=0;
			for(int i=1; i<=8; i++) {
				sum+=arr[i];
			}
			int avg=sum/8;
			if(sum%8*10/8>=5) {
				avg+=1;
			}
			
			
			System.out.println("#"+test+" "+avg);
		}
	}
}