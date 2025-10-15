import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int current = 1;
		boolean possible = true;
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			while(current<=a) {
				s.add(current);
				sb.append("+"+"\n");
				current++;
				
			}
			
			if(s.peek()==a) {
				sb.append("-"+"\n");
				s.pop();
			}else {
				possible=false;
			}
		}
		
		if(possible) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
		
		
	}
}