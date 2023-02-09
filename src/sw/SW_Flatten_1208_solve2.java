package sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_Flatten_1208_solve2 {
	static int[] floor;
	// minIdx : floor �迭���� ���̰� ���� ���� index, maxIdx�� �� �ݴ�
	static int dump, minIdx, maxIdx;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; ++t) {

			dump = Integer.parseInt(br.readLine());
			floor = new int[100];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; ++i) {
				floor[i] = Integer.parseInt(st.nextToken());
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
