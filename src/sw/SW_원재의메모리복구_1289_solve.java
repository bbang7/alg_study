package sw;

import java.util.Scanner;


public class SW_�����Ǹ޸𸮺���_1289_solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; ++t) {
			int count = 0;
			String str = sc.nextLine(); // ���๮�ڵ� ���� �д´�

			int cnt = str.length();
			int[] inputArray = new int[cnt];
			int[] memArray = new int[cnt]; // 0�ʱ�ȭ

			for (int i = 0; i < cnt; ++i) {
				inputArray[i] = str.charAt(i) - 48;// char->int
			}
			// �Է� �Ϸ�

			for (int i = 0; i < cnt; ++i) {
				if (memArray[i] != inputArray[i]) { // �ٸ���

					for (int j = i; j < cnt; ++j) {// �ٸ� index ���� �ڱ���
						memArray[j] = inputArray[i];
					}

					count++;
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
