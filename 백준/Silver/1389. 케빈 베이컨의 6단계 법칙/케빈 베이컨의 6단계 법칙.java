import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N + 1][N + 1]; 
        
        
        for (int i = 1; i <= N; i++) {
           
            for (int j = 1; j <= N; j++) {
             arr[i][j] = 1_000_000;
             }
        
            arr[i][i] = 0;
        }
        
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[A][B] = 1; 
            arr[B][A] = 1; 
        }

        for (int C = 1; C <= N; C++) { 
            for (int A = 1; A <= N; A++) { 
                for (int B = 1; B <= N; B++) { 
                    
                    if (arr[A][B] > arr[A][C] + arr[C][B]) {
                        arr[A][B] = arr[A][C] + arr[C][B];
                    }
                }
            }
        }

        int cnt = Integer.MAX_VALUE; 
        int num = 0; 
        
        for (int i = 1; i <= N; i++) { 
            int sum = 0; 
            for (int j = 1; j <= N; j++) {
                sum += arr[i][j];
            }
          
            if (cnt > sum) {
                cnt = sum;
                num = i;
            }
        }
        System.out.println(num);
    }
}