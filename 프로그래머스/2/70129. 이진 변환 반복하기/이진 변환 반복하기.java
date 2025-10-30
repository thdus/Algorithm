import java.util.*;

class Solution {
    public int[] solution(String s) {
        int cnt=0;
        int zero=0;
        while(!s.equals("1")){
            int one = 0;
            for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        
       
        zero+=s.length() - one;
            
        s = Integer.toBinaryString(one);
        cnt++;
       
        }
        
        int[] ans = new int[2];
        ans[1] = zero;
        ans[0] = cnt;
        return ans;
    }
}