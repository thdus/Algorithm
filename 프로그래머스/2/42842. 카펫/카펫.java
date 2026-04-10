import java.util.*;

class Solution {
    static int x;
    static int y;
    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
      
        for(int i=1; i<=yellow; i++){
            if(yellow%i==0&&(i+2)*(yellow/i+2)==sum){
                y=i;
                x = yellow/i;
                break;
            }
        }
        answer[0]=x+2;
        answer[1]=y+2;
        
        return answer;
    }
}