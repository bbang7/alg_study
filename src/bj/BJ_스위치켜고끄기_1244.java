package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_스위치켜고끄기_1244 {
	static int N;
	static int[] switches;
	static int S;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		switches = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; ++i)
			switches[i] = Integer.parseInt(st.nextToken());

		S = Integer.parseInt(br.readLine());

		for (int i = 0; i < S; ++i) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (gender == 1) {
				for (int j = num; j <= N; j += num) {
					switches[j] = (switches[j] + 1) % 2;
				}
			}

			else if (gender == 2) {
				switches[num] = (switches[num] + 1) % 2;
				for (int j = 1; j <= N - num; ++j) {
					if (num + j <= N && num - j > 0) {
						switches[num + j] = (switches[num + j] + 1) % 2;
						switches[num - j] = (switches[num - j] + 1) % 2;
					}
				}

			}
		}
		for (int i = 1; i <= N; ++i)
			System.out.print(switches[i] + " ");
	}
}
