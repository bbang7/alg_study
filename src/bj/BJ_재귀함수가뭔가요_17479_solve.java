package bj;

import java.util.Scanner;

public class BJ_����Լ���������_17479_solve {
	static int N;
	static String[] MSG_ARRAY = { "\"����Լ��� ������?\"", "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.",
			"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.", "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"" };

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		sb.append("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		chatbot(0);
		System.out.println(sb);

	}

	static void chatbot(int depth) {
		for (int j = 0; j < depth; ++j)
			sb.append("____");
		sb.append("\"����Լ��� ������?\"");

		// ��������
		if (depth == N) {
			for (int j = 0; j < depth; ++j)
				sb.append("____");
			sb.append("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			for (int j = 0; j < depth; ++j)
				sb.append("��� �亯�Ͽ���.");

		}

		// �� ����
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < depth; ++j)
				sb.append("____");
			sb.append(MSG_ARRAY[i]).append('\n');

		}
		
		// ��� ȣ��
		chatbot(depth+1);
		
		for (int j = 0; j < depth; ++j)
			sb.append("____");
		sb.append("��� �亯�Ͽ���.");
		
	}
}
