import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int t=1; t<=10; t++) {
			t = sc.nextInt();
			
			String ans = sc.next();
			String ans1 = sc.next();
			int cnt = 0;
			for(int i=0; i<ans1.length()-1; i++) {
				for(int j=0; j<ans.length(); j++) {
					if(ans1.charAt(i)==ans.charAt(j)) {
						i++;
					}else {
						if(j>0) {
							i=i-j;
						}
						break;}
				
				if(j==ans.length()-1) {
					cnt++;
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
}
