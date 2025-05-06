
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			String input = sc.next();
		int open=0;
		int cnt=0;
		for(int i=0; i<input.length();i++) {
		if(input.charAt(i)=='(') {
			if(input.charAt(i+1)==')'&&i+1<input.length()) {
				cnt+=open;
				i++;
			}else {
				open++;;
			}
		}else {
			open--;
			cnt++;
            
		}
		}System.out.println("#"+test_case+" "+cnt);

		}
	}
}