class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        for(int i=0; i<length; i++){
            answer+=Math.min(name.charAt(i)-'A','Z'-name.charAt(i)+1);
        }
        
        int move = length-1;
        
        for(int i=0; i<length; i++){
            int next = i+1;
            
            while(next<length&&name.charAt(next)=='A'){
                next++;
            }
            
            move = Math.min(move, i*2+length-next);
            
            move = Math.min(move, i+2*(length-next));
            
        }
        
        return answer+move;
    }
}