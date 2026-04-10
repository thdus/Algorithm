import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int a[] = new int[sizes.length];
        int b[] = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            int x = sizes[i][0];
            int y = sizes[i][1];
            
            if(x>y){
                a[i]=x;
                b[i]=y;
            }else{
                a[i]=y;
                b[i]=x;
            }
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return a[sizes.length-1]*b[sizes.length-1];
    }
}