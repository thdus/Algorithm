
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
	
		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
			sc.nextInt();
			int [][] arr= new int [100][100];
		
			for (int i =0; i<100; i++){
				for(int j = 0; j<100; j++){
				arr[i][j]=sc.nextInt();
			}}

			int max=0;
			for (int i=0; i <100; i++){
				int sum=0;
				for(int j=0; j<100;j++){
					sum+=arr[i][j];
			}
				max=Math.max(max,sum);
			}

			for (int j=0; j<100; j++){
				int sum=0;
				for(int i=0; i<100;i++){
					sum+=arr[i][j];
			}
				max=Math.max(max,sum);
			}

			int crossL =0;
			for (int i=0; i<100; i++){
				crossL += arr[i][i];
			}

			max = Math.max(max,crossL);

			int crossR =0;
			for (int i = 0; i<100; i++){
				crossR += arr[99-i][i];
			}

			max = Math.max(max, crossR);

			System.out.println("#"+test_case+" "+max);

		}
	}
}