package basic;

public class Subset_Param {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int COUNT;

// select 배열을 non static 으로
	public static void main(String[] srgs) {
		boolean[] select = new boolean[src.length];
		subset(0, select);
		System.out.println(COUNT);
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
