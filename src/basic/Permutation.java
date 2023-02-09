package basic;

import java.util.Arrays;

// ����
// �̹� ���� index �� �������� �ʱ� ���� ������ �ڷᱸ�� : select
public class Permutation {
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];
	static int COUNT;
	static boolean[] select = new boolean[src.length];

	public static void main(String[] args) {
		// 0 <- �ڸ��� �� �տ������� ����
		// 0 <- tgt �� �ڸ���
		// tgt �� ù��°�ڸ����� ä�������ڴ�.
		perm(0);
		System.out.println(COUNT); // ��ü ����� ��
	}

	// tgtIdx �ڸ��� �� �ϳ��� �����ϰڴ�
	// �׷� ������ ��� ���� tgt �� ä�������ڴ�.
	// ��� ȣ�ⱸ���̹Ƿ� ���������� �ʿ�
	static void perm(int tgtIdx) {

		// ��������
		// 0 -> 1 -> 2 -> 3 : 3�̸� �̹� tgt ������ �Ϸ�
		if (tgtIdx == tgt.length) {
			// complete code
			// ����� �� �� �Ѱ����� �ϼ��� ����
			System.out.println(Arrays.toString(tgt));
			++COUNT;
			return;
		}

		// ���� tgtIdx�� ä�� src �� ���� ����
		// src�� �� ���� ������ ���
		// �̹� ���� ���� ���� (index ǥ��)
		for (int i = 0; i < src.length; ++i) {

			// �̹� ���� ���� ����
			// ���� src ���� i ��° index �� �̹� ���õǾ����� �װ� ����ϴ� select ���� Ȯ��
			//bool �迭�� ������� ������ 1,1,1/ 1,1,2... �ߺ� �����ϰ� �� �� �ִ�
			if (select[i] == true)
				continue;

			// �� �κ��� ����Ǵ� ���� ���� i ��° ���� tgt �� ���� ��� X
			tgt[tgtIdx] = src[i]; // ���� !!!!!!!
			select[i] = true; // ���� ���

			// ���� tgtIdx�� ä������ ���� tgt�� ä�췯 �̵�
			// ���ȣ���� �ϵ� tgtIdx + 1 �� ���� => ���� �ڸ��� ä��� ����
			// ���� i �� for ���� ������ ���� ��
			perm(tgtIdx + 1);
			select[i] = false; // ���� ��� ����

		}
	}
}
