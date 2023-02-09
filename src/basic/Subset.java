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
		// ��������
		if (srcIdx == src.length) {
			printSubset();
			++COUNT;
			return;
		}

		// ���� srcIdx �� ���Ҹ� ���� Ȥ�� ���� 2���� ���� ���ȣ���� �̾��.
		// ���� => select �迭�� srcIdx �� true
		// ���� => select �迭�� srcIdx �� false;
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
