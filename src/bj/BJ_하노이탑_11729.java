package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_�ϳ���ž_11729 {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		hanoi(N, 1, 2, 3); // ù ��° ȣ���� from to 1->3ž�� �̵�

		System.out.println(sb.toString());

	}

	// �� �ܰ迡�� �̵��� ���õ� ������ sb�� append
	static void hanoi(int n, int from, int temp, int to) {
		// ���� ����
		if(n == 0) return;
		//���� : to �� �������� n-1 ���� temp �� �̵�
		hanoi(n-1,from,to,temp);
		//���� : from �� �� ���� ������ to �� �̵� <= ��� ����
		sb.append(from).append(" ").append(to).append('\n');
		//���� : temp�� �ִ� n-1���� to �� �̵�
		hanoi(n-1,temp,from,to);
		
		
	}

}

