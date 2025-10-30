import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        
        List<Integer> result = new ArrayList();
        
        int i =0;
        
        
        
        while(st.hasMoreTokens()){
            
                result.add(Integer.parseInt(st.nextToken()));
                
        }
        
        int[] arr = new int[result.size()];
        
        for(int n:result){
            arr[i++] = n;
        }
        
        Arrays.sort(arr);
        
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
        
        
        int min = arr[0];
        int max = arr[arr.length-1];
        
        String ans =min+" "+max;
        
        return ans;
        
        
        
        
    }
}