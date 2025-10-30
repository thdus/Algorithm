import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String a = Character.toUpperCase(s.charAt(0))+"";
        System.out.println(a);
        String ans="";
        ans+=a;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==' '){
                ans+=Character.toUpperCase(s.charAt(i))+"";
            }else{
                ans+=Character.toLowerCase(s.charAt(i))+"";
            }
        }
        
        return ans;
    }
}