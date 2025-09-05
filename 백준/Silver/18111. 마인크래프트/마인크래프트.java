import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		int min = Integer.MAX_VALUE;
		int max =0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				int h = arr[i][j];
				
				if(h<min) {
					min=h;
				}
				
				if(h>max) {
					max=h;
				}
			}
		}
		int[] time = new int[257];
		for(int h=min; h<=max; h++) {
			int temp =B;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(arr[i][j]>h) {
						time[h]+=2*(arr[i][j]-h);
						temp+=arr[i][j]-h;
					}else if(arr[i][j]<h) {
						time[h]+=h-arr[i][j];
						temp-=h-arr[i][j];
					}
				}
			}
			if(temp<0) {
				max=h-1;
				break;
			}
		}
		
		int minTime = Integer.MAX_VALUE;
		int minHigh = min;
		for(int i=min; i<=max; i++) {
			if(time[i]<=minTime) {
				minTime = time[i];
				minHigh = i;
				
			}
		}
		
		
		System.out.println(minTime+" "+minHigh);
	
	}
}