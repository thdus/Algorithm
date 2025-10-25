class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true; // 직전 문자가 공백이면 true

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isStart) { // 단어의 첫 문자 위치
                if (Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                isStart = (c == ' '); // 공백이면 여전히 단어 시작 상태 유지
            } else { // 단어의 중간
                if (Character.isLetter(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
                isStart = (c == ' ');
            }
        }
        return sb + "";
    }
}
