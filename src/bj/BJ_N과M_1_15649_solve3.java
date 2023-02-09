package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ڿ��� �״�� 1�� �����ϴ� ���� src �̹Ƿ� src �迭�� ���� ���� �ʰ�, select �迭�� �� index�� �̿��ؼ� �ذ�
public class BJ_N��M_1_15649_solve3 {

	static int N, M;
	static int[] tgt;
	static boolean[] select;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 1����
		M = Integer.parseInt(st.nextToken());

		select = new boolean[N + 1];
		tgt = new int[M];

		perm(0);
	}

	static void perm(int tgtIdx) {
		// ��������
		if (tgtIdx == M) {
			// complete code : ���
			for (int n : tgt) {
				System.out.print(n + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; ++i) {
			if (select[i])
				continue;

			tgt[tgtIdx] = i;
			select[i] = true;
			perm(tgtIdx + 1);
			select[i] = false;
		}
	}
}
