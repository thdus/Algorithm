import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
//         Map<String, String> map = new HashMap();
        
        
//         for(int i=0; i<participant.length; i++){
//             map.put(participant[i],"");
//         }
        
//         for(int i=0; i<completion.length; i++){
//             if(map.containsKey(completion[i])){
//                 map.remove(completion[i]);
//             }
//         }
        
//         System.out.println(map);
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
     
        
//         for(int i=0; i<participant.length; i++){
//             System.out.println(participant[i]);
//         }
        
//            for(int i=0; i<completion.length; i++){
//             System.out.println(completion[i]);
//         }
        
       
        
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return  participant[i];
            }
                
        }
        
        return participant[participant.length-1];
        
        
    }
}