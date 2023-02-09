package basic;

import java.util.Arrays;

public class Comb_FOR {

	static int COUNT;
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];

	public static void main(String[] args) {
		comb(0, 0); // �� : srcIdx, �� : tgtIdx
		System.out.println(COUNT);

	}

	// tgt �� tgtIdx �ڸ��� src �� ���� ����� �ǵ�, srcIdx ���� ��� ( �� ���� srcIdx �� �̹� ��� �ߴ�)
	static void comb(int srcIdx, int tgtIdx) {

		// ��������
		if (tgtIdx == tgt.length) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}

		// srcIdx ���� src ���� ���
		for (int i = srcIdx; i < src.length; ++i) {
			tgt[tgtIdx] = src[i];
//			System.out.println(Arrays.toString(tgt));
			comb(i + 1, tgtIdx + 1);
		}

	}

}
