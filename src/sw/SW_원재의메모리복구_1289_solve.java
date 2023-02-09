package sw;

import java.util.Scanner;


public class SW_원재의메모리복구_1289_solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; ++t) {
			int count = 0;
			String str = sc.nextLine(); // 개행문자도 따로 읽는대

			int cnt = str.length();
			int[] inputArray = new int[cnt];
			int[] memArray = new int[cnt]; // 0초기화

			for (int i = 0; i < cnt; ++i) {
				inputArray[i] = str.charAt(i) - 48;// char->int
			}
			// 입력 완료

			for (int i = 0; i < cnt; ++i) {
				if (memArray[i] != inputArray[i]) { // 다르면

					for (int j = i; j < cnt; ++j) {// 다른 index 부터 뒤까지
						memArray[j] = inputArray[i];
					}

					count++;
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
