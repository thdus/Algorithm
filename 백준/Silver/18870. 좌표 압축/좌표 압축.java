import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] original = new int[N];
		int[] sorted = new int[N];
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			original[i] = a;
			sorted[i] = a;
		}
		
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> hs = new HashMap<>();
		int idx =0;
		for(int key:sorted) {
			if(!hs.containsKey(key)) {
				hs.put(key, idx++);
			}
		}
		
		for(int i=0; i<N; i++) {
			sb.append(hs.get(original[i])+" ");
		}
		
		System.out.println(sb);
		
		
				
	}
}