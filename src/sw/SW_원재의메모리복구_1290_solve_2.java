package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
public class SW_원재의메모리복구_1290_solve_2 {
	static int T, count;
	static char[] input, memory;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; ++t) {

			int count = 0;
			input = br.readLine().toCharArray();
			int cnt = input.length;

			memory = new char[cnt];
			for (int i = 0; i < cnt; ++i) {
				memory[i] = '0';
			}
			// 입력 완료

			for (int i = 0; i < cnt; ++i) {
				if (memory[i] != input[i]) { // 다르면

					for (int j = i; j < cnt; ++j) {// 다른 index 부터 뒤까지
						memory[j] = input[i];
					}

					count++;
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
