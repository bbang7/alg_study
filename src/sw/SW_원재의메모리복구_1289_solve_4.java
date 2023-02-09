package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
// 비교 대상인 memory 배열 X <= 입력이 바뀌면 그에 따라 memory 배열도 뒤까지 바뀌므로 결국 input 자체가 바뀌는 횟수를 구하는 것과 동일

// 재귀 호출 => 이 문제에 적합한 솔루션은 아니지만 연습용 변화
public class SW_원재의메모리복구_1289_solve_4 {
	static int T, count;
	static char[] input, memory;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; ++t) {

			int count = 0;

			input = br.readLine().toCharArray();
			int cnt = input.length;
			// 입력 완료

			char current = '0';
			next(cnt,0,current);
			System.out.println("#" + t + " " + count);
		}

	}
	
	
	static void next(int cnt, int idx,char current) {
		// 기저조건
		if(idx == cnt) return;
		char ch = input[idx];
		if(ch!=current) ++count;
		
		next(cnt,idx+1,ch);
	}
}
