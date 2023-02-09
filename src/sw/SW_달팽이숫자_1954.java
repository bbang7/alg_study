package sw;

import java.util.Scanner;

public class SW_달팽이숫자_1954 {
	static int T, N;
	static int[][] map;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; ++tc) {
			N = sc.nextInt();

			map = new int[N][N];

			int x = 0;
			int y = N - 1;

			int cnt = 1;
			for (int i = 0; i < N; ++i) {
				map[0][i] = cnt++;
			}
			int wid = N - 1;
			int d = 0;
			while (N > 0) {

				for (int k = 0; k < 2; ++k) {
					if (d >= 4)
						d %= 4;
					for (int i = 0; i < wid; ++i) {
						int nx = x + dx[d];
						int ny = y + dy[d];
						map[nx][ny] = cnt++;
						x = nx;
						y = ny;
					}
					d++;
				}
				wid--;
				N--;
			}
            sb.append("#"+tc+"\n");

			for (int[] arr : map) {
				for (int a : arr) {
					sb.append(a + " ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
