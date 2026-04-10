import java.util.*;

class Solution {
    static int sum=0;
    static int t;
    static int cnt=0;
    static int len;
    static int[] arr;
    
    public int solution(int[] numbers, int target) {
        arr=numbers;
        len = numbers.length;
        t=target;
        
        dfs(0);
        return cnt;
    }
    
    public static void dfs(int n){
       
        
        if(n==len&&t==sum) {
            cnt++;
                           }
        if(n==len) return;
       
            sum+=arr[n];
            dfs(n+1);
            sum-=arr[n]*2;
            dfs(n+1);
            sum+=arr[n];
        
    }
}