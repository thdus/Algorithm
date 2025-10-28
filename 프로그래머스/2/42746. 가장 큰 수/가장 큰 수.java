import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1️⃣ 숫자를 문자열로 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 2️⃣ (a+b) vs (b+a) 비교로 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 3️⃣ 모든 숫자가 0인 경우 처리 (예: [0,0,0] → "0")
        if (arr[0].equals("0")) return "0";

        // 4️⃣ 순서대로 이어붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);

        return sb.toString();
    }
}
