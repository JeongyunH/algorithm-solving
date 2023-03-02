import java.util.*;

class Main {
	public int solution(int n) {
		int[] dy = new int[n+1];
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3 ; i<=n ; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		
		return dy[n];
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
