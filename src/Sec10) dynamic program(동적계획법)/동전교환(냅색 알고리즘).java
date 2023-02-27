import java.util.*;

// dy[i] : i 금액을 만드는데 드는 최소 동전 개수
class Main {
	static int n, m;
	static int[] dy;
	public int solution(int[] coin) {
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0 ; i<n ; i++){
			for(int j=coin[i] ; j<=m ; j++){
				dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
			}
		}		
		return dy[m];
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = kb.nextInt();
		m = kb.nextInt();
		dy = new int[m+1];
		System.out.println(T.solution(arr));
	}
}
