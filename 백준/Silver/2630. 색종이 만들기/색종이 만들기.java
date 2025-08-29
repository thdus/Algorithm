
import java.io.*;
import java.util.*;


public class Main{
	static int N;
	static int white, blue;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr=new int[N][N];
		
		for(int r=0; r<N; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c=0; c<N; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		find(0,0,N);
		System.out.println(white);
		System.out.println(blue);
	}
	private static void find(int r, int c, int num) {
		int sum=0;
		
		for(int i=r; i<r+num; i++) {
			for(int j=c; j<c+num; j++) {
				sum+=arr[i][j];
			}
		}
		
		if(sum==0) {
			white++;
		}else if(sum==num*num) {
			blue++;
		}else {
			if(num!=1) {
				find(r,c,num/2);
				find(r+num/2,c+num/2,num/2);
				find(r+num/2,c,num/2);
				find(r,c+num/2,num/2);
			}
		}
		
	}
}