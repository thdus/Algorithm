
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int[][] map;
	static int[] dr={-1,1,0,0};
	static int[] dc= {0,0,-1,1};
	static List<Integer> arr = new ArrayList<>();
	static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      N = sc.nextInt();
      sc.nextLine(); 
      map = new int[N][N];
      
      for(int i=0; i<N; i++) {
    	  String line = sc.nextLine();
    	  for(int j=0; j<N; j++) {
    		  map[i][j] = line.charAt(j) - '0';
    	  }
      }


      
      for(int i=0; i<N; i++) {
    	  for(int j=0; j<N; j++) {
    		  if(map[i][j]==1) {
    			  cnt=0;
    			  dfs(i,j);
    			  arr.add(cnt);
    		  }
    	  }
      }System.out.println(arr.size());
      Collections.sort(arr);
      for(int size : arr) {
    	  System.out.println(size);
      }
	}

	private static void dfs(int i, int j) {
		map[i][j] =0;
		cnt++;
		
		for(int d=0; d<4; d++) {
			int nr = dr[d]+i;
			int nc = dc[d]+j;
			if(nr>=0&&nr<N&&nc>=0&&nc<N&&map[nr][nc]==1) {
				dfs(nr,nc);
			}
		}
		
		
		
	}
}
