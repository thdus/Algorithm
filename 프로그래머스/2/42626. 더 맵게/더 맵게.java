import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        PriorityQueue<Integer> q = new PriorityQueue();
        
        for(int i=0; i<scoville.length; i++){
            q.offer(scoville[i]);
        }
        
        if(q.peek()>=K) return 0;
        
        while(q.peek()<K&&q.size()>=2){
            int a = q.poll();
            int b = q.poll();
            if(b==0) return -1;
            q.offer(a+2*b);
            cnt++;
        }
        
        if(q.peek()<K){
            return -1;
        }else{
             return cnt;
        }
        
       
    }
}