import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> pq = new PriorityQueue();
			for(int i=0; i<n; i++) {
				pq.add(Integer.parseInt(br.readLine()));
			}
			
			
			
			for(int i=0; i<n; i++) {
				sb.append(pq.poll()+"\n");
			}
			
			System.out.println(sb);
	}
}