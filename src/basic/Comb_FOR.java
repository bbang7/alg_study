package basic;

import java.util.Arrays;

public class Comb_FOR {

	static int COUNT;
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];

	public static void main(String[] args) {
		comb(0, 0); // 앞 : srcIdx, 뒤 : tgtIdx
		System.out.println(COUNT);

	}

	// tgt 의 tgtIdx 자리에 src 의 수를 고려할 건데, srcIdx 부터 고려 ( 그 이전 srcIdx 는 이미 고려 했다)
	static void comb(int srcIdx, int tgtIdx) {

		// 기저조건
		if (tgtIdx == tgt.length) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}

		// srcIdx 부터 src 에서 고려
		for (int i = srcIdx; i < src.length; ++i) {
			tgt[tgtIdx] = src[i];
//			System.out.println(Arrays.toString(tgt));
			comb(i + 1, tgtIdx + 1);
		}

	}

}
