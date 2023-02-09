package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_N과M_1_15649_solve {
	static int N, M;
	static int[] src, tgt;
	static boolean[] select;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 1부터
		M = Integer.parseInt(st.nextToken());

		src = new int[N + 1]; // 0 : dummy
		select = new boolean[N + 1];
		tgt = new int[M];

		for (int i = 1; i <= N; ++i)
			src[i] = i;
		
		perm(0);
	}
	
	static void perm(int tgtIdx) {
		// 기저조건
		if(tgtIdx == M) {
			// complete code : 출력
			for(int n:tgt) {
				System.out.print(n + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;++i) {
			if(select[i]) continue;
			
			tgt[tgtIdx] = src[i];
			select[i] = true;
			perm(tgtIdx+1);
			select[i] = false;
		}
		
	}
}
