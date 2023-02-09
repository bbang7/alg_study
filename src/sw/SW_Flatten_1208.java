package sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// Æ²¸²

public class SW_Flatten_1208 {

	static int dumpCnt;
	static int MAP[];
	static int left, right;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MAP = new int[101];
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		for (int T = 1; T <= 10; ++T) {
			dumpCnt = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());

			left = 0;
			right = 100;

			sb.append("#" + T + " ");

			for (int i = 0; i < 100; ++i)
				MAP[Integer.parseInt(st.nextToken())]++;

			solve(dumpCnt);

			if (MAP[left] == 0)
				left++;
			if (MAP[right] == 0)
				right--;
			sb.append(right - left);

			sb.append('\n');
		}

		System.out.println(sb);
	}

	static void solve(int dc) {

		int c = 0;

		while (left < right) {
			if (c == dc)
				return;

			if (MAP[left] != 0 && MAP[right] != 0) {
				MAP[left]--;
				MAP[left + 1]++;
				MAP[right]--;
				MAP[right - 1]++;
				++c;
				continue;
			}

			if (MAP[left] == 0) {
				++left;
			}
			if (MAP[right] == 0) {
				--right;
			}
		}
	}

	static int diff(int a, int b) {
		return Math.abs(a - b);
	}
}
