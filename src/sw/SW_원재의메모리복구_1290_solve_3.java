package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
// �� ����� memory �迭 X <= �Է��� �ٲ�� �׿� ���� memory �迭�� �ڱ��� �ٲ�Ƿ� �ᱹ input ��ü�� �ٲ�� Ƚ���� ���ϴ� �Ͱ� ����
public class SW_�����Ǹ޸𸮺���_1290_solve_3 {
	static int T, count;
	static char[] input, memory;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; ++t) {

			int count = 0;

			input = br.readLine().toCharArray();
			int cnt = input.length;
			// �Է� �Ϸ�

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
