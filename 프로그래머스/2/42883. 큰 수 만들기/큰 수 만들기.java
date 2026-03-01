class Solution {
    public String solution(String number, int k) {
       
        
    StringBuilder sb = new StringBuilder();
    int remove = k;
    
    for (int i = 0; i < number.length(); i++) {
        char current = number.charAt(i);
        
        // 앞에 작은 숫자 제거
        while (remove > 0 && sb.length() > 0 
               && sb.charAt(sb.length() - 1) < current) {
            sb.deleteCharAt(sb.length() - 1);
            remove--;
        }
        
        sb.append(current);
    }
    
    // 아직 제거할 수가 남았으면 뒤에서 제거
    return sb.substring(0, sb.length() - remove);
    }
}
