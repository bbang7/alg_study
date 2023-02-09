package basic;

public class Subset {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int COUNT;
	static boolean[] select = new boolean[src.length];

	public static void main(String[] srgs) {
		subset(0);
		System.out.println(COUNT);
	}

	static void subset(int srcIdx) {
		// 기저조건
		if (srcIdx == src.length) {
			printSubset();
			++COUNT;
			return;
		}

		// 현재 srcIdx 의 원소를 선택 혹은 비선택 2가지 경우로 재귀호출을 이어간다.
		// 선택 => select 배열의 srcIdx 를 true
		// 비선택 => select 배열의 srcIdx 를 false;
		select[srcIdx] = true;
		subset(srcIdx + 1);

		select[srcIdx] = false;
		subset(srcIdx + 1);

	}

	private static void printSubset() {

		for (int i = 0; i < select.length; ++i) {
			System.out.print((select[i] ? src[i] : "#") + " ");
		}
		System.out.println();
	}
}
