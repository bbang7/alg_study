package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_����Լ���������_17478 {
static int N;
static String bar = "____";
static boolean flag = false;

static StringBuilder sb = new StringBuilder();

public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N =Integer.parseInt(br.readLine());
	System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
	func(N,0);
	System.out.println(sb);
	
}

static void func(int n,int cnt) {
	System.out.println("here");
	String bar2 = "";
	for(int i=0;i<cnt;++i) bar2+=bar;
	sb.append(bar2).append("\"����Լ��� ������?\"").append('\n');
	if(cnt == n) {
		flag = true;
		sb.append(bar2).append("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"").append('\n');
		sb.append(bar2).append("��� �亯�Ͽ���.").append('\n');
		return;
	}
	sb.append(bar2).append("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.").append('\n');
	sb.append(bar2).append("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.").append('\n');
	sb.append(bar2).append("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"").append('\n');
	
	func(n,++cnt);
	
	sb.append(bar2).append("��� �亯�Ͽ���.").append('\n');
	
}
}
