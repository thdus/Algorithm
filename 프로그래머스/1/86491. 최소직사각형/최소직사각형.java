import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>=sizes[i][1]){
                w[i] = sizes[i][0];
                h[i] = sizes[i][1];
            }else{
                w[i] = sizes[i][1];
                h[i] = sizes[i][0];
            }
        }   
        
        Arrays.sort(w);
        Arrays.sort(h);
   
        return w[sizes.length-1]*h[sizes.length-1];
        
    }
}