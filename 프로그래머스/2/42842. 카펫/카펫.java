class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int x=1;
        while(x<=Math.sqrt(yellow)){
            if(yellow%x==0){
                if((yellow/x+2)*(x+2)-yellow==brown){
                    answer[0] = yellow/x+2;
                    answer[1] = x+2;
                    break;
                }else{
                    x++;
                }
            }else{
                x++;
            }
        }
        
        return answer;
    }
}