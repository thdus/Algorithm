import java.util.*;
import java.io.*;


class Solution {
    public int solution(int[] citations) {
      
        int h = 10000;
        while(h>0){
        int cnt1=0;
        int cnt2=0;
        for(int i=0; i<citations.length; i++){  
            if(citations[i]>=h) cnt1++;
            
            
            }
            
            if(cnt1>=h){
                return h;
            }else{
                h--;
                cnt1=0;
                cnt2=0;
            }
            
        }return 0;
    }
}