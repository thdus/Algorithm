import java.io.*;
import java.util.*;

public class Main{
	static class Document{
		int index;
		int priority;
		
		Document(int index, int priority){
			this.index = index;
			this.priority = priority;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<Document> q = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<N; i++) {
				int priority = Integer.parseInt(st.nextToken());
				q.offer(new Document(i,priority));
				pq.offer(priority);
			}
			
			int order = 0;
			
			while(!q.isEmpty()) {
				Document current = q.poll();
				if(current.priority<pq.peek()) {
					q.offer(current);
				}else {
					pq.poll();
					order++;
					
					if(current.index == M) {
						System.out.println(order);
						break;
					}
				}
			}
			
			
		}
	}
}