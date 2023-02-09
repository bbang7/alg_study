package basic;

// 파리미터로 select 배열 => bitmask
// bit &, |
// & : 양 측 다 1 이면 1
// | : 1 하나만 있어도 1
// << 왼쪽 쉬프트 0으로 채움 = *2^n 생각하면 됨
// >> =>   /2^n 생각하면 됨
public class Subset_Param_BitMask {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int COUNT;

	public static void main(String[] srgs) {
		boolean[] select = new boolean[src.length];
		subset(0, select);
		System.out.println(COUNT);

		System.out.println(16 >>> 2);
		System.out.println(7 >> 2);

	}

	static void subset(int srcIdx, boolean[] select) {
		// 기저조건
		if (srcIdx == src.length) {
			printSubset(select);
			++COUNT;
			return;
		}

		// 현재 srcIdx 의 원소를 선택 혹은 비선택 2가지 경우로 재귀호출을 이어간다.
		// 선택 => select 배열의 srcIdx 를 true
		// 비선택 => select 배열의 srcIdx 를 false;
		select[srcIdx] = true;
		subset(srcIdx + 1, select);

		select[srcIdx] = false;
		subset(srcIdx + 1, select);

	}

	private static void printSubset(boolean[] select) {

		for (int i = 0; i < select.length; ++i) {
			System.out.print((select[i] ? src[i] : "#") + " ");
		}
		System.out.println();
	}
}
