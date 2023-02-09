package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_하노이탑_11729 {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		hanoi(N, 1, 2, 3); // 첫 번째 호흡의 from to 1->3탑을 이동

		System.out.println(sb.toString());

	}

	// 매 단계에서 이동과 관련된 정답은 sb에 append
	static void hanoi(int n, int from, int temp, int to) {
		// 기저 조건
		if(n == 0) return;
		//선행 : to 로 가기전에 n-1 개가 temp 로 이동
		hanoi(n-1,from,to,temp);
		//현재 : from 의 맨 앞의 원반을 to 로 이동 <= 출력 내용
		sb.append(from).append(" ").append(to).append('\n');
		//후행 : temp에 있는 n-1개를 to 로 이동
		hanoi(n-1,temp,from,to);
		
		
	}

}

