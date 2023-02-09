package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자연수 그대로 1씩 증가하는 수가 src 이므로 src 배열을 따로 두지 않고, select 배열과 그 index를 이용해서 해결
// static => local
public class BJ_N과M_1_15649_solve2 {

	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 1부터
		M = Integer.parseInt(st.nextToken());

		boolean[] select = new boolean[N + 1];
		int[] tgt = new int[M];

		perm(0, select, tgt);
	}

	static void perm(int tgtIdx, boolean[] select, int[] tgt) {
		// 기저조건
		if (tgtIdx == M) {
			// complete code : 출력
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
			perm(tgtIdx + 1, select, tgt);
			select[i] = false;
		}
	}
}
