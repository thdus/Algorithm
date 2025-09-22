import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int ans = 0; 
        int cnt = 0; 

       
        for (int i = 1; i < M - 1;) {
            
            if (S.charAt(i - 1) == 'I' && S.charAt(i) == 'O' && S.charAt(i + 1) == 'I') {
                cnt++; 

               
                if (cnt == N) {
                    ans++; 
                    cnt--; 
                }

               
                i += 2;
            } else {
                cnt = 0; 
                i++; 
            }
        }
        System.out.println(ans);
    }
}