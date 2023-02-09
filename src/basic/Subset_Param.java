package basic;

public class Subset_Param {

	static int[] src = { 1, 2, 3, 4, 5 };
	static int COUNT;

// select �迭�� non static ����
	public static void main(String[] srgs) {
		boolean[] select = new boolean[src.length];
		subset(0, select);
		System.out.println(COUNT);
	}

	static void subset(int srcIdx, boolean[] select) {
		// ��������
		if (srcIdx == src.length) {
			printSubset(select);
			++COUNT;
			return;
		}

		// ���� srcIdx �� ���Ҹ� ���� Ȥ�� ���� 2���� ���� ���ȣ���� �̾��.
		// ���� => select �迭�� srcIdx �� true
		// ���� => select �迭�� srcIdx �� false;
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
