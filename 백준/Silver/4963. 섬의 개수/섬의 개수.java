import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int h,w;
	static int[][] map;
	static int[] dr = {-1,1,0,0,-1,-1,1,1};
	static int[] dc = {0,0,-1,1,-1,1,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        w = sc.nextInt();
        h = sc.nextInt();
        if(w==0&&h==0) break;
        map = new int[h][w];
        for(int i=0; i<h; i++) {
        	for(int j=0; j<w; j++) {
        		map[i][j] = sc.nextInt();
        	}
        }
        int cnt=0;
        for(int i=0; i<h; i++) {
        	for(int j=0; j<w; j++) {
        		if(map[i][j]==1) {
        			dfs(i,j);
        			cnt++;
        		}
        	}
        }
        System.out.println(cnt);
        
        }
    
	}

	private static void dfs(int i, int j) {
		map[i][j] =0;
		
		for(int d=0; d<8; d++) {
			int nr = dr[d] + i;
			int nc = dc[d] + j;
			
			if(nr>=0&&nr<h&&nc>=0&&nc<w&&map[nr][nc]==1) {
				dfs(nr,nc);
			}

	}
	}
}
