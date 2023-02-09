import java.util.Arrays;

public class Test {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];
	static int COUNT;
	static boolean[] select = new boolean[src.length];

	public static void main(String[] args) {
		System.out.println("[순열]");
		COUNT = 0;
		perm(0);
		System.out.println("COUNT : " + COUNT);
		System.out.println("-------------------------------");

		System.out.println("[조합]");
		COUNT = 0;
		comb(0, 0);
		System.out.println("COUNT : " + COUNT);
		System.out.println("-------------------------------");

		System.out.println("[부분집합]");
		COUNT = 0;
		subset(0);
		System.out.println("COUNT : " + COUNT);

	}

	static void perm(int tgtIdx) {
		if (tgtIdx == tgt.length) {
			System.out.println(Arrays.toString(tgt));
			++COUNT;
			return;
		}

		for (int i = 0; i < src.length; ++i) {
			if (select[i])
				continue;

			tgt[tgtIdx] = src[i];
			select[i] = true;

			perm(tgtIdx + 1);
			select[i] = false;
		}
	}

	static void comb(int srcIdx, int tgtIdx) {
		if (tgtIdx == tgt.length) {
			System.out.println(Arrays.toString(tgt));
			++COUNT;
			return;
		}

		if (srcIdx == src.length)
			return;

		tgt[tgtIdx] = src[srcIdx];

		comb(srcIdx + 1, tgtIdx + 1);
		comb(srcIdx + 1, tgtIdx);
	}

	static void subset(int srcIdx) {
		if (srcIdx == src.length) {
			System.out.print("[ ");
			for (int i = 0; i < select.length; ++i) {
				System.out.print((select[i] ? src[i] : "#") + " ");
			}
			System.out.println("]");
			++COUNT;
			return;
		}

		select[srcIdx] = true;
		subset(srcIdx + 1);
		select[srcIdx] = false;
		subset(srcIdx + 1);
	}

}
