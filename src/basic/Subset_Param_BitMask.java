package basic;

// �ĸ����ͷ� select �迭 => bitmask
// bit &, |
// & : �� �� �� 1 �̸� 1
// | : 1 �ϳ��� �־ 1
// << ���� ����Ʈ 0���� ä�� = *2^n �����ϸ� ��
// >> =>   /2^n �����ϸ� ��
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
