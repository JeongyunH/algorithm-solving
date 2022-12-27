import java.util.*;

class Main {
	public void DFS(int n) {
		if(n == 0)	return;
		else {
			DFS(n/2);		// 값을 나눠가면서 나머지를 거꾸로 출력한다 
			System.out.print(n%2);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(11);
	}
}
