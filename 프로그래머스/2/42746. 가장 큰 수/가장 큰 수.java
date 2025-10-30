import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            s[i] = numbers[i]+"";
        }
        
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        
        if (s[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String n:s){
           
            sb.append(n);
        }
        
        return sb+"";
    }
}