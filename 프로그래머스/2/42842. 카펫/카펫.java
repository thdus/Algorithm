import java.util.*;

class Solution {    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<=Math.sqrt(yellow); i++){
            if(yellow%i==0){
                int a = i;
                int b = yellow/i;
                if((a+2)*(b+2)-brown==yellow){
                    answer[0] = b+2;
                    answer[1] = a+2;
                }
            }
        }
        
        return answer;
    }
}