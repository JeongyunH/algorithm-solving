import java.util.*;

class Main {
	static int n, answer;
	static int ch[];
	static int[][] graph;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i=1 ; i<=n ; i++) {
				if(graph[v][i] == 1 && ch[i]==0) {
					ch[i] = 1;
					DFS(i);			// 대칭구조(back트래킹)
					ch[i] = 0;		// back 할때 방문 해제
					// else 문이 끝나는 지점이 backtracking 하는 지점이다.
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int m = kb.nextInt();
		graph = new int[n+1][n+1];
		ch = new int [n+1];
		for(int i=0 ; i<m ; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.print(answer);
	}
}
