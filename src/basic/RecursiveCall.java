package basic;

// ���ȣ��
// stack, queue, �ڷᱸ���� ����
// stack : FILO => dfs, java.util.Collection �� stack �ڷᱸ���� ����� �� �ִ�. �� �ڷᱸ�� ��� method call �� ���
// 		   java �� method ȣ���� �̾����� �װ� ��ü�� �ٷ� stack ������ ���������� �̿�
// queue : FiFo => bfs

// ��� ������ �ϴٰ� �������� ���� => Stack Overflow
// �� �ǽ��� ���ؼ�
// 1. ��� ȣ���� ���� �� �������� ����
// 2. ���� �ܰ� - ��� ȣ�� �޼ҵ尡 ����Ǵ� - �ʿ��� �۾��� �������� ��Ȯ�� ����
// 3. ��� ȣ���� ��ġ�� ���� �۾��� ��, ���� ���� �ľ�
// 4. ��� ȣ��������� ������ �ڷᱸ���� ���� ( static, parameter )
// 5. ��� ȣ��������� ��� ���� ������ ��->�Ʒ� �Ǵ� �Ʒ�->�� �� ó���Ǵ��� ����
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
		// ���ǿ� ���� ������ ��� ȣ���� �� �̻� ȣ�� X
		if (m2_cnt > 0) {
			--m2_cnt;
			m2();
		}
		System.out.println("1 m2_cnt = " + m2_cnt);
	}

	static int m2_correct_cnt = 5;

	static void m2_correct() {
		System.out.println("1 m2_correct_cnt = " + m2_correct_cnt);
		// ������ ���� ������ ��� ȣ�� X

		if (m2_correct_cnt == 0)
			return;

		--m2_correct_cnt;
		m2_correct();

		System.out.println("1 m2_correct_cnt = " + m2_correct_cnt);
	}

	static int m2_correct2_cnt = 5;

	static void m2_correct2() {

		// ������ ���� ������ ��� ȣ���� ���̻� ȣ�� x �̷� �ڵ嵵 ���� X
		// => ��������
		if (m2_correct2_cnt == 0)
			return;

		System.out.println("1 m2_correct2_cnt = " + m2_correct2_cnt);
		// ������ ���� ������ ��� ȣ�� X

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

		m3(m3_cnt - 1); // ���� ���� �ּ��� ������ ���

		System.out.println("1 m3_cnt = " + m3_cnt);
	}
}
