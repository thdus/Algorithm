import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        
        int size = commands.length;
        
        System.out.println(size);
        List<Integer> result = new ArrayList();
       
        for(int i=0; i<size; i++){
             int count =0;
            int[] neww = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                neww[count++] = array[j];
            }
            
            Arrays.sort(neww);
            result.add(neww[commands[i][2]-1]);
            
        }
        
        int cnt =0;
        
         int[] answer = new int[result.size()];
        
        for(int num : result){
            answer[cnt++]= num;
        }
        
        
        return answer;
    }
}