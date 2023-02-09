package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_재귀함수가뭔가요_17478 {
static int N;
static String bar = "____";
static boolean flag = false;

static StringBuilder sb = new StringBuilder();

public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N =Integer.parseInt(br.readLine());
	System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
	func(N,0);
	System.out.println(sb);
	
}

static void func(int n,int cnt) {
	System.out.println("here");
	String bar2 = "";
	for(int i=0;i<cnt;++i) bar2+=bar;
	sb.append(bar2).append("\"재귀함수가 뭔가요?\"").append('\n');
	if(cnt == n) {
		flag = true;
		sb.append(bar2).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append('\n');
		sb.append(bar2).append("라고 답변하였지.").append('\n');
		return;
	}
	sb.append(bar2).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append('\n');
	sb.append(bar2).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append('\n');
	sb.append(bar2).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append('\n');
	
	func(n,++cnt);
	
	sb.append(bar2).append("라고 답변하였지.").append('\n');
	
}
}
