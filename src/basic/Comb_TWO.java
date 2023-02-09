package basic;

import java.util.Arrays;
//�ǹ��� �Ⱦ� => ���ȣ���� �ѹ� ���Ұ�

public class Comb_TWO {

	static int COUNT;
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];

	public static void main(String[] args) {
		comb(0, 0); // �� : srcIdx, �� : tgtIdx
		System.out.println(COUNT);

	}

	// tgt �� tgtIdx �ڸ��� src �� ���� ����� �ǵ�, srcIdx ���� ��� ( �� ���� srcIdx �� �̹� ��� �ߴ�)
	static void comb(int srcIdx, int tgtIdx) {

		// �������� tgt
		if (tgtIdx == tgt.length) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}
		
		// �������� src
		if(srcIdx == src.length) return;
		
		tgt[tgtIdx] = src[srcIdx]; // ����!!
		
		comb(srcIdx+1,tgtIdx+1); // ���� ������ �޾Ƶ��̰� src �� ���� �ڸ����� tgt�� ���� �ڸ����� ���
		comb(srcIdx+1,tgtIdx); // ���� ������ X srcIdx�� -> tgtIdx ������ �����ϰ�, src �� ���� �ڸ����� ���� tgtIdx �� �ٽ� ��� 
	}
}
