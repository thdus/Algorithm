import java.util.*;

class Solution {
    static List<String> dict = new ArrayList();
    static String[] vowel = {"A","E","I","O","U"};
    
    public int solution(String word) {
        
        dfs("",0);
        
        return dict.indexOf(word)+1;
    }
    
    private void dfs(String s, int depth){
        if(depth>5){
            return;
        }
        
        if(!s.equals("")) dict.add(s);
        
        for(String v: vowel){
            dfs(s+v, depth+1);
        }
        
        
    }
}