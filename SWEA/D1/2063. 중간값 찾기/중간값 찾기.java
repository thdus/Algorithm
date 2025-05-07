import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int[] arr = new int[T+1];
		for(int test_case = 1; test_case <= T; test_case++)
		{
		 arr[test_case] = sc.nextInt();
		 
		}
		Arrays.sort(arr);
		System.out.println(arr[T/2+1]);
	}
}