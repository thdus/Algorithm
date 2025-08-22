import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split("-");
		
		int[] sum = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			String[] arr2 = arr[i].split("[+]");
			
			for(int j=0; j<arr2.length; j++) {
				sum[i]+=Integer.parseInt(arr2[j]);
			}
			
		}
		int result = sum[0];
		for(int i=1; i<arr.length; i++) {
			result -= sum[i];
		}
		System.out.println(result);
	}
} 