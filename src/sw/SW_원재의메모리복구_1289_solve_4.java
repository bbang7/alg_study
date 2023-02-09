package sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner => BufferedReader
// int[] => char[]
// local => static
// �� ����� memory �迭 X <= �Է��� �ٲ�� �׿� ���� memory �迭�� �ڱ��� �ٲ�Ƿ� �ᱹ input ��ü�� �ٲ�� Ƚ���� ���ϴ� �Ͱ� ����

// ��� ȣ�� => �� ������ ������ �ַ���� �ƴ����� ������ ��ȭ
public class SW_�����Ǹ޸𸮺���_1289_solve_4 {
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
			next(cnt,0,current);
			System.out.println("#" + t + " " + count);
		}

	}
	
	
	static void next(int cnt, int idx,char current) {
		// ��������
		if(idx == cnt) return;
		char ch = input[idx];
		if(ch!=current) ++count;
		
		next(cnt,idx+1,ch);
	}
}
