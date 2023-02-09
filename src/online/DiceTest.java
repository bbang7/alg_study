package online;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {

	static int N;
	static int[] numbers;
	static int totalCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		N = sc.nextInt();

		numbers = new int[N];

		switch (mode) {
		case 1: // 중복순열
			dice1(0);
			break;
		case 2: // 순열

			break;

		}
		System.out.println("총경우의 수 : " + totalCnt);
	}

	private static void dice1(int cnt) {

		if (cnt == N) {
			System.out.println(Arrays.toString(numbers));
			totalCnt++;
			return;
		}

		for (int i = 1; i <= 6; ++i) {
			numbers[cnt] = i;
			cnt += 1;
			dice1(cnt + 1);
		}
	}
	private static void dice2(int cnt) {
		
		if (cnt == N) {
			System.out.println(Arrays.toString(numbers));
			totalCnt++;
			return;
		}
		
		for (int i = 1; i <= 6; ++i) {
			numbers[cnt] = i;
			cnt += 1;
			dice1(cnt + 1);
		}
	}
}
