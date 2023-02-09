package sw;

import java.io.FileInputStream;
import java.util.Scanner;

public class SW_Flatten_1208_solve {
	static int[] floor;
	// minIdx : floor �迭���� ���̰� ���� ���� index, maxIdx�� �� �ݴ�
	static int dump, minIdx, maxIdx;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; ++t) {

			dump = sc.nextInt();
			floor = new int[100];

			for (int i = 0; i < 100; ++i) {
				floor[i] = sc.nextInt();
			}

			// �ݺ������� dump ��ŭ
			for (int i = 0; i < dump; ++i) {

				// �ִ�, �ּ� ���̸� ������ minIdx, maxIdx �� ���
				reset();

				// ������ �ܰ����� ���� Ȯ�� - ���������� break, �ƴϸ� ��źȭ �۾� ���� maxIdx �ϳ� ���̰� minIdx �ϳ� �ø���
				int gap = floor[maxIdx] - floor[minIdx];
				if (gap == 0 || gap == 1)
					break;

				floor[maxIdx]--;
				floor[minIdx]++;
			}

			reset();
			// �ִ�, �ּ� ���̸� ������ minIdx, maxIdx �� ��� �ѹ� ��
			int result = floor[maxIdx] - floor[minIdx];
			System.out.println("#" + t + " " + result);
		}
	}

	// floor �迭�� �ִ� �ּ� idx ����
	static void reset() {
		for (int i = 0; i < 100; ++i) {
			// min
			if (floor[i] < floor[minIdx])
				minIdx = i;

			if (floor[i] > floor[maxIdx])
				maxIdx = i;
		}
	}
}
