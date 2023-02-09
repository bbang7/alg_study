package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
public class SW_�����Ǹ޸𸮺���_1290_solve_2 {
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
			// �Է� �Ϸ�

			for (int i = 0; i < cnt; ++i) {
				if (memory[i] != input[i]) { // �ٸ���

					for (int j = i; j < cnt; ++j) {// �ٸ� index ���� �ڱ���
						memory[j] = input[i];
					}

					count++;
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
