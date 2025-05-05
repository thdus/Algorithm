import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
        
		
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
			int tc = sc.nextInt();
			String word = sc.next();
			String sen = sc.next();
		
			int cnt =0;
			for(int i=0; i<=sen.length()-word.length(); i++) {
				boolean isok=true;
				for(int j=0; j<word.length();j++) {
					if(sen.charAt(i+j)!=word.charAt(j)) {
						isok=false;
						break;
						
					}
				}
					if(isok) {
						cnt++;
				}
				
			}System.out.println("#"+test_case+ " "+cnt);


		}
	}
}