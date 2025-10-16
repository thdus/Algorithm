	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;

	public class Main{
	   public static void main(String[] args) throws IOException{
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringBuilder sb = new StringBuilder();
	      
	      int n = Integer.parseInt(br.readLine());
	      int[] arr = new int[n];
	      int[] count = new int[8001];
	      int sum=0;
	      
	      for(int i=0; i<n; i++) {
	         arr[i] = Integer.parseInt(br.readLine());
	         count[arr[i]+4000]++;
	         sum+=arr[i];
	      }
	      sum = (int)Math.round((double)sum/n);
	      
	      sb.append(sum).append("\n");
	      
	      Arrays.sort(arr);
	      
	      sb.append(arr[n/2]).append("\n");;
	      
	      int maxMode = 0;
	      for(int i=0; i<count.length; i++) {
	         maxMode = Math.max(maxMode, count[i]);
	      }
	      
	      boolean first = false;
	      int mode = 0;
	      
	      for(int i=0; i<count.length; i++) {
	         if(count[i]==maxMode) {
	        	 if(!first) {
	            mode = i-4000;
	            first=true;
	         }else {
	            mode = i-4000;
	            break;
	         }
	      }
	      }
	      sb.append(mode).append("\n");
	      
	      
	      sb.append(arr[n-1]-arr[0]);
	      
	      System.out.println(sb);
	      
	   }
	}