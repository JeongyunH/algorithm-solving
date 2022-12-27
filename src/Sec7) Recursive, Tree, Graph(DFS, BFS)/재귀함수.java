import java.util.*;

class Main {
	public void DFS(int n) {
		if(n == 0)	return;	// 함수 종료의 의미 재귀함수 끝
		else {
			DFS(n-1);			
			System.out.print(n + " ");
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3);
	}
}
