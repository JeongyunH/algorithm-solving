import java.util.*;

class Main {
	static int n, m, answer = Integer.MIN_VALUE;
	static int[][] arr;
	public void DFS(int L, int sum, int min) {
		if(min > m)	return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr[L][0], min+arr[L][1]);
			DFS(L+1, sum, min);			
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n][2];
		for(int i=0 ; i<n ; i++) {
			arr[i][0] = kb.nextInt();
			arr[i][1] = kb.nextInt();
		}
		T.DFS(0, 0, 0);
		System.out.println(answer);
	}
}
