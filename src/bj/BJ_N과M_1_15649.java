package bj;

import java.util.Scanner;

public class BJ_N°úM_1_15649 {
	static int N, M;
	static int[] tgt = new int[8];
	static boolean[] select=new boolean[9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		perm(0);
		
		
	}
	
	static void perm(int idx) {
		
		if(idx ==M) {
			for(int i=0;i<M;++i) {
				System.out.print(tgt[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1;i<=N;++i) {
			if(select[i]) continue;
			
			tgt[idx] = i;
			select[i] = true;
			perm(idx+1);
			select[i] = false;
		}
		
	}

}
