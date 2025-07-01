import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] size = br.readLine().split(" ");
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		
		char[][] map = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String line = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j]=line.charAt(j);
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int cnt1=0;
				int cnt2=0;
				
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						char c = map[i+x][j+y];
						if((x+y)%2==0) {
							if(c!='W')cnt1++;
							if(c!='B')cnt2++;
						}else {
							if(c!='B')cnt1++;
							if(c!='W')cnt2++;
						}
					}
				}
				min = Math.min(min, Math.min(cnt1, cnt2));
			}
		}
		System.out.println(min);
	}
}



















