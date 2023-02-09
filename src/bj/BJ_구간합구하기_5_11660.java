package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_구간합구하기_5_11660 {
	static int N, M;
	static int[][] map;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N + 1][N + 1];

		for (int i = 1; i <= N; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; ++j) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= N; ++i) {
			for (int j = 1; j <= N; ++j) {
				map[i][j] += map[i - 1][j] + map[i][j - 1] - map[i - 1][j - 1];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; ++i) {
			st = new StringTokenizer(br.readLine());
			int fX = Integer.parseInt(st.nextToken());
			int fY = Integer.parseInt(st.nextToken());
			int tX = Integer.parseInt(st.nextToken());
			int tY = Integer.parseInt(st.nextToken());
			sb.append(map[tX][tY] + map[fX - 1][fY - 1] - map[tX][fY - 1] - map[fX - 1][tY]);
			sb.append("\n");
		}
		System.out.println(sb);

	}
}
