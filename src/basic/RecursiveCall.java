package basic;

// 재귀호출
// stack, queue, 자료구조의 이해
// stack : FILO => dfs, java.util.Collection 에 stack 자료구조를 사용할 수 있다. 이 자료구조 대신 method call 을 사용
// 		   java 는 method 호출이 이어지면 그것 자체가 바로 stack 구조를 내부적으로 이용
// queue : FiFo => bfs

// 재귀 오지게 하다가 무한으로 가면 => Stack Overflow
// 이 실습을 통해서
// 1. 재귀 호출의 구조 및 기저조건 이해
// 2. 현재 단계 - 재귀 호출 메소드가 실행되는 - 필요한 작업이 무엇인지 명확히 이해
// 3. 재귀 호출의 위치에 따른 작업의 선, 후행 관계 파악
// 4. 재귀 호출과정에서 변수나 자료구조의 공유 ( static, parameter )
// 5. 재귀 호출과정에서 답안 도출 과정이 위->아래 또는 아래->위 로 처리되는지 구분
public class RecursiveCall {

	public static void main(String[] args) {
		factorial(5);
		System.out.println(result);

		int ret = factorial2(5);
		System.out.println(ret);

		System.out.println(hanoi(5));
	}

	// hanoi (recursion)
	public static int hanoi(int n) {
		return n == 1 ? 1 : 2 * hanoi(--n) + 1;
	}

	// factorial (recursion)
	static int result = 1;

	static void factorial(int n) {
		if (n == 1)
			return;
		result *= n;
		factorial(--n);
	}

	static int factorial2(int n) {
		if (n == 1)
			return 1;
		return n * factorial2(--n);
	}

	static void m1() {
		m2();
	}

	static int m2_cnt = 5;

	static void m2() {
		System.out.println("1 m2_cnt = " + m2_cnt);
		// 조건에 맞지 않으면 재귀 호출을 더 이상 호출 X
		if (m2_cnt > 0) {
			--m2_cnt;
			m2();
		}
		System.out.println("1 m2_cnt = " + m2_cnt);
	}

	static int m2_correct_cnt = 5;

	static void m2_correct() {
		System.out.println("1 m2_correct_cnt = " + m2_correct_cnt);
		// 조건이 맞지 않으면 재귀 호출 X

		if (m2_correct_cnt == 0)
			return;

		--m2_correct_cnt;
		m2_correct();

		System.out.println("1 m2_correct_cnt = " + m2_correct_cnt);
	}

	static int m2_correct2_cnt = 5;

	static void m2_correct2() {

		// 조건이 맞지 않으면 재귀 호출을 더이상 호출 x 이래 코드도 진행 X
		// => 기저조건
		if (m2_correct2_cnt == 0)
			return;

		System.out.println("1 m2_correct2_cnt = " + m2_correct2_cnt);
		// 조건이 맞지 않으면 재귀 호출 X

		--m2_correct2_cnt;
		m2_correct2();
		++m2_correct2_cnt;

		System.out.println("1 m2_correct2_cnt = " + m2_correct2_cnt);
	}

	// parameter
//	static int m3_cnt = 5;
	static void m3(int m3_cnt) {

		if (m3_cnt == 0)
			return;

		System.out.println("1 m3_cnt = " + m3_cnt);

//		--m3_cnt;
//		m3(m3_cnt);
//		++m3_cnt;

		m3(m3_cnt - 1); // 위에 세줄 주석과 동일한 결과

		System.out.println("1 m3_cnt = " + m3_cnt);
	}
}
