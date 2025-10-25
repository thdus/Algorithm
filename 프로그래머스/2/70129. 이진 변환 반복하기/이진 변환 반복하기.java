class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        int step=0;
        int zeros=0;
        
        while(!s.equals("1")){
            int zero=0;
            for(char c:s.toCharArray()){
                if(c=='0'){
                    zero++;
                }
            }
            
            int len = s.length() - zero;
            s = Integer.toBinaryString(len);
            step++;
            zeros+=zero;
        }
        return new int[] {step, zeros};
    }
}