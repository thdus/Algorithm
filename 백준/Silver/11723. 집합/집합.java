import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class Main{
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		
		/*
		 * 처음 M에 주어진다.
		 * -> M번 연산(줄)을 입력받기
		 * -> 각 줄에 대한 명령을 수행한다.
		 * 
		 * 1. M 입력받기
		 * 2. M번만큼 줄 입력받기
		 * 3. 각 줄의 명령 수행하기
		 * 
		 * 명령
		 * 	add: 집합 S에 추가
		 * 		- 이미 있는 경우 무시 -> Set쓰면 알아서 처리됨
		 *  remove: 집합 S에서 삭제
		 *  	- 없는 경우 무시 -> 있는지 확인 있으면 처리
		 *  check: 집합 S에 있으면 1, 없으며 0 출력
		 *  	- 단순 출력
		 *  toggle: 집합 S에 있으면 삭제, 없으면 추가
		 *  	- 있는지 확인 -> 있으면 remove, 없으면 add
		 *  all: 집합 S를 {1, 2, ..., 20} 변경
		 *  empty: 집합 S를 공집합으로 변경
		 * 
		 * Set
		 * - HashSet : 중복 불가, 순서 없음
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()); // M: 한 줄 받기
		
		Set<Integer> S = new HashSet<>(); // 집합 S
		
		// M번만큼 for문 돌기
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cal = st.nextToken();
			
			if(!cal.equals("all") && !cal.equals("empty")) {
				int num = Integer.parseInt(st.nextToken());
				if (cal.equals("add")) {
					S.add(num);
				} else if (cal.equals("remove")) {
						S.remove(num);
				} else if (cal.equals("check")) {
					if(S.contains(num)) {
						sb.append(1+"\n");
					}else {
						sb.append(0+"\n");
					}
				} else if (cal.equals("toggle")) {
					if(S.contains(num)) {
						S.remove(num);
					} else {
						S.add(num);
					}
				}
			}
			if (cal.equals("all")) {
				S.clear();
				for(int j=1; j<=20; j++) {
					S.add(j);
				}
			} else if (cal.equals("empty")) {
				S.clear();
			}
		}
		
		System.out.println(sb);
	}
}