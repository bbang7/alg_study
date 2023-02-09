package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
// 비교 대상인 memory 배열 X <= 입력이 바뀌면 그에 따라 memory 배열도 뒤까지 바뀌므로 결국 input 자체가 바뀌는 횟수를 구하는 것과 동일
public class SW_원재의메모리복구_1290_solve_3 {
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
			for (int i = 0; i < cnt; ++i) {
				if (input[i] != current)
					count++;
				current = input[i];
			}
			System.out.println("#" + t + " " + count);
		}

	}
}
