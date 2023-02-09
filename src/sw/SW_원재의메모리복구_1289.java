package sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_원재의메모리복구_1289 {
	static int T;
	static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		T = Integer.parseInt(br.readLine());
		sb = new StringBuilder();

		for (int tc = 1; tc <= T; ++tc) {
			ans =0;
			sb.append("#" + tc + " ");

			String s = br.readLine();

			func(s, s.length() - 1, s.length() - 2);
			sb.append(ans);

			sb.append('\n');
		}

		System.out.println(sb);

	}

	static void func(String s, int cur, int next) {
		if (next < 0 && s.charAt(0) == '0')
			return;
		else if (next < 0 && s.charAt(0) == '1') {
			++ans;
			return;
		}

		if (s.charAt(cur) == s.charAt
				(next))
			func(s, next, next - 1);
		else {
			++ans;
			func(s, next, next - 1);
		}

	}
}
