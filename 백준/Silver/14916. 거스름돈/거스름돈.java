import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt=n/5;
		int ans = Integer.MAX_VALUE;
		while(cnt>=0) {
	
			if((n-(5*cnt))%2==0) {
				ans = Math.min(cnt+(n-(5*cnt))/2, ans);
				break;
			}else {
				cnt--;
			}
		}
		if(ans!=Integer.MAX_VALUE) {
			
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
	}
}

