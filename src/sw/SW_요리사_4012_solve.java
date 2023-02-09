package sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_요리사_4012_solve {
	// 식재료 N => 반, 반 각각 요리 A, 요리 B;
	// N -> N/2개 조합으로 선택
	// 1, 2, 3, 4, 5, 6 재료..
	// {1,3,4} => A, {2,5,6} => B
	// boolean[] 배열에 해당되는 index 값을 A 에 선택되었으면 true 로 솔정하면, 선택안되었으면 (B) false 로 남아
	// 있다.
	// N/2 개의 조합이 안되는 시점에 시너지 계산을 A 따로 B 따로 계산해서 차이가 최소가 되는 값 구한다.
	// 위 계산을 하려면 N -> N/2 로 생기는 조합의 각각 경우의 수가 완성되면 그 때 계산.

	static int T, N, min;
	static int[][] map;
	static boolean[] select; // A,B 두 그룹으로 나누기 위한 자료구조 <= 조합 자체에 필요한 자료구조 X
	static int[] arrA, arrB; // 각각 선택된 재료의 index (N 개 중의)

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; ++t) {

			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			select = new boolean[N];

			arrA = new int[N / 2];
			arrB = new int[N / 2];

			// 시너지
			for (int i = 0; i < N; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; ++j) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 풀이
			min = Integer.MAX_VALUE;
			comb(0, 0);
			System.out.println("#" + t + " " + min + "\n");

		}
	}

	static void comb(int srcIdx, int tgtIdx) {
		// 기저조건1
		if (tgtIdx == N / 2) {
			// 경우의 수가 완성 - Complete Code
			check(); // 이 경우의 조합으로 만들어지는 시너지를 계산하고 따져본다.
			return;
		}

		if (srcIdx == N)
			return;

		// tgt 배열에 넣는 것이 아니라, select 배열에 index를 표시하는 걸로 선택
		select[srcIdx] = true;
		comb(srcIdx + 1, tgtIdx + 1); // 위 선택 accept

		select[srcIdx] = false;
		comb(srcIdx + 1, tgtIdx);// 위 선택 accept X

	}

	static void check() {
		// 그룹 A, 그룹 B 로 나눈다
		// 각각 A는 A재료끼리, B는 B 재료끼리 시너지 계산
		// 두 그룹의 시너지 합의 차이가 최소값 갱신

		int idxA = 0;
		int idxB = 0;
		for (int i = 0; i < N; i++) {
			if (select[i])
				arrA[idxA++] = i;
			else
				arrB[idxB++] = i;
		}

		// 1,2,3,4,5,6 재료
		// {1,3,4} => A. {2,5,6} => B
		// 시너지 계산 <= map 을 이용하되 수행횟수는 N/2 <= for 의 대상은 arrA 또는 arrB 이다
		// 대신 시너지를 계산할 때 map 2차원 배열 이용
		// 같은 그룹 for-for
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
