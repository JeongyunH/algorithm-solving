import java.util.*;

class Main {
public int solution(int n, int m, int arr[][]) {
		int answer = 0;
		int pi=0, pj=0;
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				int cnt=0;
				for(int k=0 ; k<m ; k++) {
					for(int s=0 ; s<n ; s++) {
						if(arr[k][s] == i+1)	pi = s;
						if(arr[k][s] == j+1)	pj = s;
					}
					if(pi<pj)	cnt++;
				}
				if(cnt == m) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();	// �л� ��
		int m = kb.nextInt();	// ���� Ƚ��
		int[][] arr = new int[m][n];
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<n ; j++)
				arr[i][j] = kb.nextInt();
		}

		System.out.print(T.solution(n, m, arr));
	}
}
