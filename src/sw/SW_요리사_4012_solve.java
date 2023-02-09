package sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_�丮��_4012_solve {
	// ����� N => ��, �� ���� �丮 A, �丮 B;
	// N -> N/2�� �������� ����
	// 1, 2, 3, 4, 5, 6 ���..
	// {1,3,4} => A, {2,5,6} => B
	// boolean[] �迭�� �ش�Ǵ� index ���� A �� ���õǾ����� true �� �����ϸ�, ���þȵǾ����� (B) false �� ����
	// �ִ�.
	// N/2 ���� ������ �ȵǴ� ������ �ó��� ����� A ���� B ���� ����ؼ� ���̰� �ּҰ� �Ǵ� �� ���Ѵ�.
	// �� ����� �Ϸ��� N -> N/2 �� ����� ������ ���� ����� ���� �ϼ��Ǹ� �� �� ���.

	static int T, N, min;
	static int[][] map;
	static boolean[] select; // A,B �� �׷����� ������ ���� �ڷᱸ�� <= ���� ��ü�� �ʿ��� �ڷᱸ�� X
	static int[] arrA, arrB; // ���� ���õ� ����� index (N �� ����)

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; ++t) {

			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			select = new boolean[N];

			arrA = new int[N / 2];
			arrB = new int[N / 2];

			// �ó���
			for (int i = 0; i < N; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; ++j) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// Ǯ��
			min = Integer.MAX_VALUE;
			comb(0, 0);
			System.out.println("#" + t + " " + min + "\n");

		}
	}

	static void comb(int srcIdx, int tgtIdx) {
		// ��������1
		if (tgtIdx == N / 2) {
			// ����� ���� �ϼ� - Complete Code
			check(); // �� ����� �������� ��������� �ó����� ����ϰ� ��������.
			return;
		}

		if (srcIdx == N)
			return;

		// tgt �迭�� �ִ� ���� �ƴ϶�, select �迭�� index�� ǥ���ϴ� �ɷ� ����
		select[srcIdx] = true;
		comb(srcIdx + 1, tgtIdx + 1); // �� ���� accept

		select[srcIdx] = false;
		comb(srcIdx + 1, tgtIdx);// �� ���� accept X

	}

	static void check() {
		// �׷� A, �׷� B �� ������
		// ���� A�� A��᳢��, B�� B ��᳢�� �ó��� ���
		// �� �׷��� �ó��� ���� ���̰� �ּҰ� ����

		int idxA = 0;
		int idxB = 0;
		for (int i = 0; i < N; i++) {
			if (select[i])
				arrA[idxA++] = i;
			else
				arrB[idxB++] = i;
		}

		// 1,2,3,4,5,6 ���
		// {1,3,4} => A. {2,5,6} => B
		// �ó��� ��� <= map �� �̿��ϵ� ����Ƚ���� N/2 <= for �� ����� arrA �Ǵ� arrB �̴�
		// ��� �ó����� ����� �� map 2���� �迭 �̿�
		// ���� �׷� for-for
		// 1 3 4
		// 1
		// 3
		// 4

		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < N / 2; i++) {
			for (int j = 0; j < N / 2; j++) {
				if (i == j)
					continue;
				sumA += map[arrA[i]][arrA[j]];
				sumB += map[arrB[i]][arrB[j]];
			}

		}

		min = Math.min(min, Math.abs(sumA - sumB));

	}

}
