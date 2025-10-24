import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> hm = new HashMap();
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				String b = st.nextToken();
				
				hm.put(b,hm.getOrDefault(b, 0)+1);
			}
			int ans = 1;
			for(int num : hm.values()) {
				ans*=num+1;
			}
			
			sb.append(ans-1+"\n");
			
		}
		System.out.println(sb);
		
	}
}
