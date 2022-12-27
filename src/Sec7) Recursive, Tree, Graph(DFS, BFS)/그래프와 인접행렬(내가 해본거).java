import java.util.*;

class Main {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(arr[i][j] == 1) answer++;
			}
		}
		return answer/2;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[n+1][n+1];
		for(int i=0 ; i<m ; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		System.out.print(T.solution(n, arr));
	}
}
