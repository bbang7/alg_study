package sw;

import java.io.FileInputStream;
import java.util.Scanner;

public class SW_Flatten_1208_solve {
	static int[] floor;
	// minIdx : floor 배열에서 높이가 가장 낮은 index, maxIdx는 그 반대
	static int dump, minIdx, maxIdx;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; ++t) {

			dump = sc.nextInt();
			floor = new int[100];

			for (int i = 0; i < 100; ++i) {
				floor[i] = sc.nextInt();
			}

			// 반복적으로 dump 만큼
			for (int i = 0; i < dump; ++i) {

				// 최대, 최소 높이를 가지는 minIdx, maxIdx 를 계산
				reset();

				// 마지막 단계인지 여부 확인 - 마지막으면 break, 아니면 평탄화 작업 수행 maxIdx 하나 줄이고 minIdx 하나 늘리고
				int gap = floor[maxIdx] - floor[minIdx];
				if (gap == 0 || gap == 1)
					break;

				floor[maxIdx]--;
				floor[minIdx]++;
			}

			reset();
			// 최대, 최소 높이를 가지는 minIdx, maxIdx 를 계산 한번 더
			int result = floor[maxIdx] - floor[minIdx];
			System.out.println("#" + t + " " + result);
		}
	}

	// floor 배열의 최대 최소 idx 갱신
	static void reset() {
		for (int i = 0; i < 100; ++i) {
			// min
			if (floor[i] < floor[minIdx])
				minIdx = i;

			if (floor[i] > floor[maxIdx])
				maxIdx = i;
		}
	}
}
