import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        
        return min+" "+max;
    }
}