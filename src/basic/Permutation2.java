package basic;

import java.util.Arrays;

// 순열
// 이미 사용된 index 를 재사용하지 않기 위해 별도의 자료구조 : select
//bool 배열을 사용하지 않으면 1,1,1/ 1,1,2... 중복 가능하게 할 수 있다

public class Permutation2 {
	static int[] src = { 1, 2, 3, 4, 5 };
	static int[] tgt = new int[3];
	static int COUNT;
	static boolean[] select = new boolean[src.length];

	public static void main(String[] args) {
		// 0 <- 자릿수 맨 앞에서부터 시작
		// 0 <- tgt 의 자릿수
		// tgt 의 첫번째자리부터 채워나가겠다.
		perm(0);
		System.out.println(COUNT); // 전체 경우의 수
	}

	// tgtIdx 자리에 수 하나를 선택하겠다
	// 그런 다음에 계속 다음 tgt 를 채워나가겠다.
	// 재귀 호출구조이므로 기저조건이 필요
	static void perm(int tgtIdx) {

		// 기저조건
		// 0 -> 1 -> 2 -> 3 : 3이면 이미 tgt 선택이 완료
		if (tgtIdx == tgt.length) {
			// complete code
			// 경우의 수 중 한가지가 완성된 상태
			System.out.println(Arrays.toString(tgt));
			++COUNT;
			return;
		}

		// 현재 tgtIdx에 채울 src 의 수를 선택
		// src의 맨 앞의 수부터 고려
		// 이미 사용된 수는 제외 (index 표현)
		for (int i = 0; i < src.length; ++i) {

			//bool 배열을 사용하지 않으면 1,1,1/ 1,1,2... 중복 가능하게 할 수 있다
			tgt[tgtIdx] = src[i]; // 선택 !!!!!!!
			perm(tgtIdx + 1);

		}
	}
}
