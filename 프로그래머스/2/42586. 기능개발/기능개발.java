import java.util.*;
import java.io.*;

class Solution {
    public  ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[progresses.length];
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0){
                q.offer((100-progresses[i])/speeds[i]);
            }
            else{
               q.offer((100-progresses[i])/speeds[i]+1);
        }
       
    }
        ArrayList<Integer> arr1 = new ArrayList();
        int cnt=1;
        int num=q.remove();
        while(!q.isEmpty()){
           
            if(num>=q.peek()){
                q.remove();
                cnt++;
            }
            else{
                num=q.remove();
                arr1.add(cnt);
                cnt=1;
            }
        }
        arr1.add(cnt);
        System.out.println(arr1);
    
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = arr1.get(i);
        // }
        return arr1;
} 
}