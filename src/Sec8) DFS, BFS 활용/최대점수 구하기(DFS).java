import java.util.*;

class Main {
	static int n, m, answer = Integer.MIN_VALUE;
	public void DFS(int L, int sum, int time, int[] score, int[] minute) {
		if(time > m)	return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+score[L], time+minute[L], score, minute);
			DFS(L+1, sum, time, score, minute);			
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		int[] score = new int[n];
		int[] minute = new int[n];
		for(int i=0 ; i<n ; i++) {
			score[i] = kb.nextInt();
			minute[i] = kb.nextInt();
		}
		T.DFS(0, 0, 0, score, minute);
		System.out.println(answer);
	}
}
