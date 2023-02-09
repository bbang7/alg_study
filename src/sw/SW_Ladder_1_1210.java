package sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_Ladder_1_1210 {
	static int[][] MAP;
	static int destX, destY;
	static int[] checkHorizon = { 1, -1 };

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		for (int t = 1; t <= 10; ++t) {
			MAP = new int[100][100];
			sb.append("#" + t + " ");
			int tc = Integer.parseInt(br.readLine());

			// 배열 입력, 목적지 y 좌표 구하기
			for (int i = 0; i < 100; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; ++j) {
					MAP[i][j] = Integer.parseInt(st.nextToken());
					if (MAP[i][j] == 2) {
						destX = i - 1;
						destY = j;
					}
				}
			}

			while (destX > 0) {
				// 좌우 체크 후 이동
				for (int i = 0; i < 2; ++i) {
					int ny = destY + checkHorizon[i];
					if (ny >= 0 && ny < 100 && MAP[destX][ny] == 1) {
						while (MAP[destX][ny] != 0) {
							ny += checkHorizon[i];
							if(ny<0 ||ny>=100) {
								break;
							}
						}
						destY = ny - checkHorizon[i];
						break;
					}

				}

				destX--;
			}

			sb.append(destY + "\n");
		}
		System.out.println(sb);

	}
}
